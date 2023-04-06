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
			System.out.println("���� ����");
			
			String sql = "insert into users ( userid, username, userpassword, userage, useremail ) values (?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "spring");
			pstmt.setString(2, "�Ͽ���");
			pstmt.setString(3, "1234543");
			pstmt.setString(4, "27");
			pstmt.setString(5, "summer@mycompany.com");
			
			int rows = pstmt.executeUpdate();//DB�� insert�� �����ϴ� ���
			System.out.println("����� �� ������ ? " + rows);
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
