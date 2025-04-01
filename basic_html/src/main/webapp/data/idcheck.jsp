<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String users[][] = { 
			 {"윤하빈","함희원","김준수","김호진","박준범"},
			 {"yun@nate.com","apink@gmail.com","jun_su@naver.com","hijin@nate.com","junbum@nate.com"},
			 {"yunha","ham1004","kimjuns","hojin15","junbum04"}
		};
	try{
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int count = 0;
		int x;
		for(x=0; x<users[0].length; x++){
			if(users[0][x].equals(name) && users[1][x].equals(email)){
				out.print("회원아이디 : " + users[2][x]);
				count++;
			}
		}
		if(count == 0){
			out.print("해당 사용자의 이름과 이메일이 일치하는 사용자가 없습니다.");
		}
	}
	catch(Exception e){
%>		
	<script>
		alert("해당 데이터가 올바르게 전달되지 않았습이다.");
		history.go(-1);
	</script>
<%
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>