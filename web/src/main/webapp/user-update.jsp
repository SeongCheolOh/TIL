<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.web.common.DBCon"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String uiNum = request.getParameter("uiNum");

Connection con = DBCon.getCon();
String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD, UI_DATE FROM USER_INFO WHERE UI_NUM=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, uiNum);
ResultSet rs = pstmt.executeQuery();
if (rs.next()) {
%>
<form method="POST" action="/user-update-ok.jsp">
	<input type="hidden" name="uiNum" value="<%=rs.getInt("UI_NUM")%>"><br>
	이름 : <input type="text" name="uiName" value="<%=rs.getString("UI_NAME")%>"><br>
	아이디 : <input type="text" name="uiId" value="<%=rs.getString("UI_ID")%>"><br>
	비밀번호 : <input type="text" name="uiPwd" value="<%=rs.getString("UI_PWD")%>"><br>
	<button>수정</button>
</form>
<%
}
%>
니가 보고 싶은 유저의 번호 :
<%=uiNum%>