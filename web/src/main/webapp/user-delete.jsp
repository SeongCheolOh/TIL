<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.web.common.DBCon"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%
String uiNum = request.getParameter("uiNum");

Connection con = DBCon.getCon();

String sql = "DELETE FROM USER_INFO WHERE UI_NUM=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, uiNum);
int result = pstmt.executeUpdate();

if (result == 1) {
%>
	<script>
		alert('유저가 정상적으로 삭제되었습니다.');
		location.href = '/users.jsp';
	</script>
	<%
} else {
%>
	<script>
		alert('유저가 삭제되지 않았습니다.');
		location.href = '/users.jsp';
	</script>
<%
	} %>