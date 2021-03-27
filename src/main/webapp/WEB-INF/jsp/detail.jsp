<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="${contextPath}/resources/css/details.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/header.css">
    <link rel="shortcut icon" type="image/ico" href="${contextPath}/resources/img/favicon.ico"/>
    
    <title>Просмотр</title>
</head>
<header>
	<nav>
        <div class="logo">
            <img src="${contextPath}/resources/img/newLogo.svg" onclick='location.href="/"' alt="Логотип РУП Витебскэнерго">
        </div>
        <div class="user_go_out_block">
            <button class="go_out_button" onclick='location.href="/logout"'></button>
        </div>
    </nav>
</header>

<body>
    <div class="main">
        <div class="head_block">
        	<h3>АКТ:<i> ${numAct} от ${dateAct} </i></h3>
            <h3>АБОНЕНТ:<i> ${consumer} </i></h3>
            <h3>ДОГОВОР:<i> ${contract} </i></h3>
            <h3>УЧАСТОК:<i> ${department} </i></h3>
            <h3>К ОПЛАТЕ:<i> ${cost} </i></h3>
            <h3>СТАТУС АКТА:<i> ${status} </i></h3>
        </div>
        <table id="main_table" class="table_view" style="display: block;">
            <tr>
                <th>Приложенные файлы:</th>
            </tr>
            <c:forEach var="element" items="${files}">
				<tr>
					<td><a href="/download?file=${element.id}">${element.fileName}</a></td>
				</tr>
			</c:forEach>
        </table>
    </div>
</body>

</html>