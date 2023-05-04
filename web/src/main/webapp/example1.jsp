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
</head>
<body>
	<%
	Connection con; //연결 준비
	Class.forName("com.mysql.cj.jdbc.Driver"); //유심 장착
	//전화번호부 저장
	String url = "jdbc:mysql://localhost/nothing";
	String id = "root";
	String pw = "1234";
	//저장한 정보를 보고 전화
	con = DriverManager.getConnection(url, id, pw);
	//전화 받음
	Statement stmt = con.createStatement();
	//내용 말해달라고 요청
	ResultSet answer = stmt.executeQuery("SELECT EX_NUM, EX_NAME, EX_ID, EX_PW, EX_ADDR, EX_GENDER, EX_INTRO, EX_DATE FROM EXAMPLE");
	%>
	<table border = "1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>서식지</td>
			<td>성별</td>
			<td>특징</td>
			<td>생성일</td>
		</tr>
		<%
		while(answer.next()){
			int exNum = answer.getInt("EX_NUM");
			String exName = answer.getString("EX_NAME");
			String exID = answer.getString("EX_ID");
			String exPW = answer.getString("EX_PW");
			String exAddr = answer.getString("EX_ADDR");
			String exGender = answer.getString("EX_GENDER");
			String exIntro = answer.getString("EX_INTRO");
			Date exDate = answer.getDate("EX_DATE");
			out.println("<tr>");
			out.println("<td>" + exNum + "</td>");
			out.println("<td>" + exName + "</td>");
			out.println("<td>" + exID + "</td>");
			out.println("<td>" + exPW + "</td>");
			out.println("<td>" + exAddr + "</td>");
			out.println("<td>" + exGender + "</td>");
			out.println("<td>" + exIntro + "</td>");
			out.println("<td>" + exDate + "</td>");
			out.println("</tr>");
		}
		%>
	</table>
</body>
</html>