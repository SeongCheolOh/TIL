package com.web.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {

	public static Connection getCon() {
		Connection con = null; // 커넥션 준비
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/nothing"; // 전화번호
			String id = "root"; // id
			String pwd = "1234"; // pw
			con = DriverManager.getConnection(url, id, pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 전화 걸고
		return con;
	}
}
