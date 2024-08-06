package webkdh.ex2.preparedstmt데이터베이스보안;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedMain {

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
			beforeInsert(conn);
			
			int empNo = 104;
			String name = "Steven";
			// 1. 쿼리문 준비 (매개변수(입력받은)값은 ? 로 나타낸다.)
//			String query = "select * from employees where employee_id = ?";
//			String query = "select * from employees where first_name like '%' || ? || '%'"; // like 연산자띠
			String query = "select * from employees where first_name like ?"; // like 연산자띠
			
			// like연산자로 이름 검색
			
			// 2. PreparedStatement 객체 준비
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, empNo); // 1번째 ?에 empNo값을 세팅
//				pstmt.setString(1, name); // 1번째 ? 에 David 문자열을 세팅
				pstmt.setString(1, "%" +name+ "%"); // 1번째 ? 에 David 문자열을 세팅
				
				rs = pstmt.executeQuery(); // 쿼리문실행해서, 결과를 rs가 참조하게 한다.
				
				while (rs.next()) {
					System.out.println(
							  rs.getInt("EMPLOYEE_ID") + " "
							+ rs.getString("FIRST_NAME") + " "
							+ rs.getString("LAST_NAME") + " "
							+ rs.getString("EMAIL") + " "
							+ rs.getString("PHONE_NUMBER") + " "
							+ rs.getDate("HIRE_DATE") + " "
							+ rs.getString("JOB_ID") + " "
							+ rs.getFloat("SALARY") + " "
							+ rs.getFloat("COMMISSION_PCT") + " "
							+ rs.getInt("MANAGER_ID") + " "
							+ rs.getInt("DEPARTMENT_ID"));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		try {
			rs.close();
			pstmt.close();
			conn.close();
			System.out.println("연결 끊기");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	}
	private static void beforeInsert(Connection conn) {
		int deptNo = 310;
		String dName ="자재부";
		int managerId = 104;
		int locationId = 1800;
		
		if (conn != null) {
			String query = "insert into departments values (?, ?, ?, ?)";
			
			PreparedStatement pstmt = null;
		
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, deptNo);
				pstmt.setString(2, dName);
				pstmt.setInt(3, managerId);
				pstmt.setInt(4, locationId);
				
				int result = pstmt.executeUpdate(); 
						
				if (result == 1) {
					System.out.println("저장 성공");
				}
				
				
				pstmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}