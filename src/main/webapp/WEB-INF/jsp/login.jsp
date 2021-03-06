<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="${contextPath}/resources/css/auth.css"/>
<link rel="shortcut icon" type="image/ico" href="${contextPath}/resources/img/favicon.ico"/>
<title>Competition</title>
</head>
<body>
	<sec:authorize access="isAuthenticated()">
		<%
		    response.sendRedirect("/index");
		%>
	</sec:authorize>
	<div class="auth_reg_block">
		<div class="auth_reg_block_content">
			<p class="auth_reg_block_head_text">Авторизация</p>
			<form class="auth_reg_style" action="/login" method="post">
				<input type="text" name="username"
					placeholder="Введите логин" id="username"
					required="required" /> 
					<input type="password" name="password"
					placeholder="Введите пароль" id="password" required="required" />
				<div class="auth_reg_button">
					<button class="auth_button" type="submit" name="auth_submit">
					Вход</button>
				</div>
			</form>
			

		</div>
	</div>
</body>
</html>