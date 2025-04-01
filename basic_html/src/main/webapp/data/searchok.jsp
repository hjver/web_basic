<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	int count = 0;
	String product[][] = {
		{"삼겹살 600g", "30000", "27000"},
		{"목살 600g", "20000", "18000"},
		{"갈매기살 300g", "15000", ""},	
	};
	request.setCharacterEncoding("utf-8");
	String search = request.getParameter("search");
	out.print(search);
	
	int w = 0;
	while(w < product.length){
		if(product[w][0].indexOf(search) != -1) {
			out.print(Arrays.toString(product[w]));
			count++;
		}
		w++;
	}

	if(count == 0){
		out.print("해당 검색어에 포함된 상품은 확인되지 않습니다.");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색된 상품이 출력 되는 부분</title>
</head>
<body>

</body>
</html>