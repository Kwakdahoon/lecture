<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<title>계산기</title>
</head>
<body>
    <h1>삼각형의 모든것</h1>

    <!-- form 태그 시작 -->
    <form action="./hTriangle" method="get">
        <div>
            세로 <input type="text" name="height" />
        </div>
        <div>
            가로 <input type="text" name="width" />
        </div>
        <!-- submit 버튼을 form 태그 안으로 이동 -->
        <button type="submit">계산데스</button>
    </form>
    <!-- form 태그 끝 -->

</body>
</html>
