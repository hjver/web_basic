<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("utf-8");
    
	String mid = request.getParameter("mid");  // 고객아이디
	String mtel = request.getParameter("mtel"); // 연락처
	String magree = request.getParameter("magree");  //수신동의 여부
	String mname = request.getParameter("mname");  // 고객명
	String mcorp = request.getParameter("mcorp");  // 고객명
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 통신값을 출력하는 JSP 파일</title>
</head>
<body>
고객명 : <%=mname%><br>
고객아이디: <%=mid%><br>
연럭처 : <%=mcorp%> <%=mtel%><br>
SMS 수신여부 : <%=magree%><br>

</body>
</html>