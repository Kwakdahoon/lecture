<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">

	function callServlet() {
		location.href = "./hGET?name=마이콜";
	}
	
	function callServletAjax() {
	 $.ajax({
            url: "./hGET?name=고길동", // 데이터가 송수신 될 서버의 주소
            type: "GET", // 통신 방식 (GET, POST, PUT, DELETE)
            success: function (data) { // () 안에 있는 변수로 받아온다 (꼭 data 일 필요 없음)
                // 통신이 성공하면 수행할 함수
                console.log("ajax success");
            },
            error : function () {},
            complete: function () {}
        })
	}
	
</script>
</head>
<body>
<h1> HelloServletGet파일을 GET방식으로 호출해보자. </h1>

<div>
	<a href = "./hGET?name=조길동">a태그로 서블릿 요청</a>
</div>

<form action="./hGET" method = "get">
	<input type = "text" name="name"/>
	<button type = "submit">form태그로 GET방식 요청</button>
</form>

<button onclick = "callServlet();">location.href로 서블릿 요청</button>

<button onclick = "callServletAjax();">Ajax로 서블릿 요청 (GET방식)</button>


</body>
</html>