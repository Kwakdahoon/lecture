<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>왜 Servlet을 사용하는가</title>
<script>
	function hello() {
		alert("!");
	}
</script>
<style>
	h1 {
		background-color : yellow;
	}
</style>
</head>
<body>
	<h1 onclick = "hello();">왜 Servlet을 사용하는가</h1>
	
	<%
	int num = 30;
	out.print(num);
	// num이 짝수이면 빨간색으로 "짝수 입니다" 출력
	// 홀수이면 파란색으로 "홀수 입니다" 출력
	if (num % 2 == 0) {
	%>
		<div style = "color : red;"> 짝수 입니다 </div>
	<% 
	} else {
	%>
		<div style = "color : blue;"> 홀수 입니다 </div>
	<%
	}
	%>
1	
</body>
</html>