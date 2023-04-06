package javaCh20.lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardInserEx {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "1234");
			System.out.println("연결 성공");
			
			String sql = "insert into users ( userid, username, userpassword, userage, useremail ) values (?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "spring");
			pstmt.setString(2, "하여름");
			pstmt.setString(3, "1234543");
			pstmt.setString(4, "27");
			pstmt.setString(5, "summer@mycompany.com");
			
			int rows = pstmt.executeUpdate();//DB에 insert문 실행하는 명령
			System.out.println("저장된 행 갯수는 ? " + rows);
			pstmt.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
