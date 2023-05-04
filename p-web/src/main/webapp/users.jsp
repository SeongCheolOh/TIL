<%@page import="com.web.common.DBCon"%>
<%@page import="java.sql.PreparedStatement"%>
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
	String searchUiName = request.getParameter("uiName");
	String searchUiId = request.getParameter("uiId");
	out.println("니가 검색한 이름 : " + searchUiName);

	//db 연결
	Connection call = DBCon.getCon();

	//쿼리문
	String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD, UI_DATE FROM USER_INFO";
	if (searchUiName != null) {// ? >> stmt.setString(int, 변수)를 받는 값 +가 왜 더하기에요랑 같음
		sql += " WHERE UI_NAME LIKE CONCAT('%', ?, '%')";
		if (searchUiId != null) {
			sql += " and UI_ID LIKE CONCAT('%', ?, '%')";
		} else if (searchUiName != null) {
			sql += " WEHRE UI_ID LIKE CONCAT('%', ?, '%')";
		}

	}

	// 전화 받음
	PreparedStatement stmt = call.prepareStatement(sql);
	// 정보 전달받음
	if (searchUiName != null) {
		stmt.setString(1, searchUiName);
		if (searchUiId != null) {
			stmt.setString(2, searchUiId);
		}
	} else if (searchUiId != null) {
		stmt.setString(1, searchUiId);
	}

	ResultSet result = stmt.executeQuery();
	%>
	<form>
		<input type="text" name="uiName" placeholder="검색할 이름"> <input
			type="text" name="uiId" placeholder="검색할 아이디">
		<button>검색</button>
	</form>
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
			out.println("<tr onclick=\"location.href='/user-view.jsp?uiNum=" + uiNum + "'\">");
			out.println("<td>" + uiNum + "");
			out.println("<td>" + uiName + "");
			out.println("<td>" + uiId + "</td>");
			out.println("<td>" + uiPw + "</td>");
			out.println("<td>" + uiDate + "</td>");
			out.println("</tr>");
		}
		%>
		<tr>
			<th colspan="5">
				<button type = "button" onclick="location.href='/user-insert.jsp'">유저등록</button>
			</th>
		</tr>
	</table>
</body>
</html>