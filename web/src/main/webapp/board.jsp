<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#top{
	background-color: yellow;}
</style>
</head>
<body>
	<%
	Connection con; //커넥션 준비
	Class.forName("com.mysql.cj.jdbc.Driver"); //유심 장착

	String url = "jdbc:mysql://localhost/nothing"; //전화번호
	String id = "root"; //id
	String pwd = "1234"; //pw

	con = DriverManager.getConnection(url, id, pwd); //전화 걸고
	Statement stmt = con.createStatement(); //받음

	ResultSet rs = stmt.executeQuery("SELECT BI_NUM, BI_TITLE, BI_CONTENT, BI_WRITER, BI_CNT, BI_DATE FROM BOARD_INFO");
	%>
	<table border="1">
		<tr id="top">
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>조회수</td>
		</tr>
		<%
		while (rs.next()) {
			int biNum = rs.getInt("BI_NUM");
			String biTitle = rs.getString("BI_TITLE");
			String biWriter = rs.getString("BI_WRITER");
			int biCnt = rs.getInt("BI_CNT");
			out.println("<tr>");
			out.println("<td>" + biNum + "</td>");
			out.println("<td>" + biTitle + "</td>");
			out.println("<td>" + biWriter + "</td>");
			out.println("<td>" + biCnt + "</td>");
			out.println("</tr>");
		}
		%>
	</table>
</body>
</html>