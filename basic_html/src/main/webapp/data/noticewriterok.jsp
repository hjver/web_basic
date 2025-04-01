<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String notice[][] = {
			{"신한카드 설연휴 서비스 점검안내","admin","설연휴 3일간 신한카드 시스템 점검안내","2025-01-20"},
			{"신규 가입자 쿠폰 지급 연장안내","admin","10%신규 쿠폰 기간을 연장하게 되었습니다.","2025-01-17"},
			{"설 연휴기간 배송지연 안내","admin","설연휴 기간 월요일까지만 배송을 하게 됩니다.","2025-01-14"}
		};
	List<ArrayList<String>> alldata = new ArrayList<>();
	ArrayList<String> al = null;
	
	//foreach로 1차 원시배열을 구분하여 클래스 배열로 전달
	for(String[] arr : notice){
		al = new ArrayList(Arrays.asList(arr));  //원시배열 => 1차 배열로 이관
		alldata.add(al);
	}
	
	Date date = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	String today = sf.format(date);
	
	//Front에서 데이터를 이관 받는 코드(name 명으로 받음)
	//request : Front에서 무조건 데이터를 이관 받는 클래스
	String subject = request.getParameter("subject");
	String writer = request.getParameter("writer");
	String texts = request.getParameter("texts");

	//예외처리를 사용한 이유는 Front-end에서 값이 전송이 안되었을 경우 조건문에서 error
	try{
		if(!subject.equals("") && !writer.equals("") && !texts.equals("")){		
			al = new ArrayList<String>();  //1차 베열을 생성하여 사용자가 입력한 값을 추가
			al.add(subject);
			al.add(writer);
			al.add(texts);
			al.add(today);
			alldata.add(0, al);  //2차 배열에 등록을 함 단, 배열기준으로 맨 앞에 데이터가 저장 되도록 함
		}
	}catch(Exception e){
		
	}	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 리스트</title>
</head>
<body>
<p>전체 등록된 게시물 : <%=alldata.size()%> 개</p>
<table border="1" cellpadding="0" cellspacing="0">
<thead>
<tr>
	<th width="50">번호</th>
	<th width="500">제목</th>
	<th width="100">글쓴이</th>
	<th width="150">등록일</th>
</tr>
</thead>
<tbody>
<%
	int w = 0;
	while(w < alldata.size()) {
%>		
<tr height="30">
	<td align="center"><%=alldata.size()-w%></td>
	<td><%=alldata.get(w).get(0)%></td>
	<td align="center"><%=alldata.get(w).get(1)%></td>
	<td align="center"><%=alldata.get(w).get(3)%></td>
</tr>
<%
		w++;
	}
%>
</tbody>
</table>
<input type="button" value="글쓰기" onclick="location.href='./notice_writer.html'">
</body>
</html>