package webkdh.ex1.update데이터베이스dml문;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateMain {
	
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
//			e.printStackTrace();
			System.out.println("드라이버를 찾을 수 없습니다.");
			
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("DB에 연결하지 못했습니다.");
		}
		
		if (conn != null) {
			String dName = "태스트";
			int deptNo = 300;
			
			
			// 1. 쿼리문 준비
			String query = 
			"UPDATE departments set department_name = '"+ dName + "' where department_id = " + deptNo;
			
			// 2. Statement 준비
			Statement stmt = null;
			
			try {
				stmt = conn.createStatement();
				
			// 3. 쿼리문 실행 + 결과
				int result = stmt.executeUpdate(query);
				if (result == 1) 
				System.out.println("수정 완료");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
		try {
			stmt.close();
			conn.close();
			System.out.println("연결 끊기");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	}
}
