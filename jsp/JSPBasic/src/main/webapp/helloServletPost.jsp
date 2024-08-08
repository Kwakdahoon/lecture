<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<title>POST 방식으로 요청</title>
<script type = "text/javascript">
// ajax

function callServletAjax() {
	
	$.ajax({
	    url: "./hPOST", // 데이터가 송수신 될 서버의 주소
	    type: "POST", // 통신 방식 (GET, POST, PUT, DELETE)
	    data : {
	    	"name" : "둘리"
	    }, // 수신받을 데이터 타입 (MIME TYPE)
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
	<form action="./hPOST" method="post">
		<div>이름 : <input type = "text" name = "name"/></div>
		<div>나이 : <input type = "text" name = "age"/></div>
		<input type = "submit" value = "전송">
	</form>
	
	<button onclick = "callServletAjax();">Ajax로 서블릿 요청</button>
</body>
</html>