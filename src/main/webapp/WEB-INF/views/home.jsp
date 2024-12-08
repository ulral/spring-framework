<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>로그인</title>
	<link rel="icon" href="resources/dino.ico" type="image/x-icon">
	<link type="text/css" rel="stylesheet" href="resources/css/home/main.css" />
</head>
<body>
	<div class="login-container">
		<form action="<c:url value='login.do'/>" method="post">
			<input type="text" name="id" id="id" placeholder="아이디" required />
			<label for="id"></label>
			<input type="password" id="password" name="password" placeholder="비밀번호" required />
			<label for="password"></label>
			<button type="submit">로그인</button>
			<!-- 아이디 저장하기 체크박스 -->
			<div class="remember-me">
				<input type="checkbox" name="remember" id="remember">
				<label for="remember">아이디 저장하기</label>
			</div>
		</form>

		<!-- 아이디/비밀번호 찾기 및 회원가입 링크 -->
		<div class="link-container">
			<a href="#">아이디 찾기</a> |
			<a href="#">비밀번호 찾기</a>
		</div>
		<div class="link-container">
			<a href="#">회원가입</a>
		</div>
	</div>
</body>

</html>
