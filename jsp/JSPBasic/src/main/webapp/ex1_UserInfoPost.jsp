<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function pwdValidation() {
		let  isValid = false;
		let pwd = document.getElementById("pwd").value;
		console.log(pwd);
		// 정규식으로 비밀번호 설정하기 (최소 8글자, 글자 1개, 숫자 1개, 특수문자 1개)
		let regExp = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/;
		console.log(regExp.test(pwd));
		if (regExp.test(pwd) == false){
			alert("비밀번호 우효")
		} else {
			isValid = true;
		}
		
		return isValid;
	}

</script>
</head>
<body>
	<form action="./암거나" method = "post">
		<div> 이름 : <input type = "text" name ="name"></div>
		<div> 아이디 : <input type = "text" name = "id"></div>
		<div> 비밀번호 : <input type ="password" name = "pwd" id = "pwd"></div>
		<input type ="submit" value = "전송" onclick = "return pwdValidation();">
	</form>
</body>
</html>