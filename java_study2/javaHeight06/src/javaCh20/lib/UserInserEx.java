package javaCh20.lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInserEx {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "1234");
			System.out.println("���� ����");
			
			String sql = "insert into boards ( bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata ) values (seq_bno.nextval, ?, ?, ?, sysdate, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "����3");
			pstmt.setString(2, "����2");
			pstmt.setString(3, "�ۼ���3");
			pstmt.setString(4, "snow3.jpg");
			pstmt.setBlob(5, new FileInputStream("C:\\webStudyB\\study\\til\\TIL\\web_study\\project\\html_project\\how_to_order\\view\\img\\button\\logo.png"));
			
			int rows = pstmt.executeUpdate();//DB�� insert�� �����ϴ� ���
			System.out.println("boards ���̺� " + rows + "���� ���Ե�");
			pstmt.close();
			
		} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
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
