<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
#1{
background-color: yellow}
</style>
</head>
<body>
	<%
	Connection call; //커넥션 준비
	Class.forName("com.mysql.cj.jdbc.Driver");//유심 장착
	//전화번호부 상대방 정보 저장
	String url = "jdbc:mysql://localhost/nothing";//전화번호 입력
	String id = "root";//아이디 입력
	String pwd = "1234";//비밀번호 입력
	//상대방 정보를 가지고 전화 걸기
	call = DriverManager.getConnection(url, id, pwd);
	//전화 받음
	Statement stmt = call.createStatement();
	//정보를 알려달라고 말함
	ResultSet result = stmt.executeQuery("SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD, UI_DATE FROM USER_INFO");
	%>
	<!-- 들은 것을 출력 -->
	<table border="1">
		<tr>
			<td>순번</td>
			<td>사용자명</td>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>생성일</td>
		</tr>
		<%
		while (result.next()) {
			int uiNum = result.getInt("UI_NUM");
			String uiName = result.getString("UI_NAME");
			String uiId = result.getString("UI_ID");
			String uiPw = result.getString("UI_PWD");
			Date uiDate = result.getDate("UI_DATE");
			out.println("<tr>");
			out.println("<td>" + uiNum + "");
			out.println("<td>" + uiName + "");
			out.println("<td>" + uiId + "</td>");
			out.println("<td>" + uiPw + "</td>");
			out.println("<td>" + uiDate + "</td>");
			out.println("</tr>");
		}
		%>
	</table>
</body>
</html>