package com.webkdh.view친구테이블연결.friends예제;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class FriendMain {
    public static void main(String[] args) {
        String id = "hr";
        String pwd = "1234";
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, id, pwd);
            System.out.println("연결 성공 : " + conn.toString());
                
        } catch (ClassNotFoundException e) {
            // 드라이버를 찾을 수 없을 때 출력
            System.out.println("드라이버를 찾을 수 없습니다.");
            
        } catch (SQLException e) {
            // DB 연결 실패 시 출력
            System.out.println("DB에 연결하지 못했습니다.");
        }
        if (conn != null) {
            Scanner sc = new Scanner(System.in);
            System.out.print("찾을 이름 입력 ->");
            String name = sc.nextLine();
            
            // PreparedStatement 사용으로 변경
            String query = "select * from friends where friendName like ?";
            PreparedStatement pstmt = null; // Statement에서 PreparedStatement로 변경
            ResultSet rs = null;
            try {
                // PreparedStatement에 값 설정
                pstmt = conn.prepareStatement(query); // conn.PreparedStatement -> conn.prepareStatement로 수정
                pstmt.setString(1, "%" + name + "%"); // 입력된 이름을 쿼리에 바인딩
                rs = pstmt.executeQuery();
                
                System.out.println("조회결과 : ");
                while (rs.next()) {
                    System.out.println(
                              rs.getInt("friendNo") + " "
                            + rs.getString("friendName") + " "
                            + rs.getString("mobile") + " "
                            + rs.getString("addr") + " ");

                }
                
            } catch (SQLException e) {
                e.printStackTrace();
                if (e instanceof SQLSyntaxErrorException) {
                    // SQL 구문 오류 시 출력
                    System.out.println("SQL 구문 오류가 발생했습니다.");
                }
            } finally {
                try {
                    // 자원 해제
                    if (rs != null) rs.close();
                    if (pstmt != null) pstmt.close();
                    if (conn != null) conn.close();
                    System.out.println("연결 끊기");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
