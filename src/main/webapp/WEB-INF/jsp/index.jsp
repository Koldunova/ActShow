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
    <link rel="stylesheet" href="${contextPath}/resources/css/main.css">
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
            
            <form:form modelAttribute="filterForm" method="post">
            <h2>№ Договора</h2>
            	<form:input id ="numContract" placeholder="Поиск по номеру договора" 
            		required="required" path="contract"/>
            	<button  type="submit"></button>
        	</form:form>
        </div>
        
        <table id="main_table" class="table_view" style="display: block;">
            <tr>
            	<th>Дата акта</th>
                <th>Абонент</th>
                <th>№ Договора</th>
                <th>Статус</th>
                <th>К оплате</th>
            </tr>
            <c:forEach var="element" items="${acts}">
				<tr>
					<td>${element.dateAct}</td>
					<td>${element.consumer}</td>
					<td>${element.contract}</td>
					<td>${element.statusAct}</td>
					<td>${element.cost}</td>
					<td class="button_td"><button class="detailed_button" onclick='location.href="/detail?id=${element.id}"'>Подробнее</button></td>
				</tr>
			</c:forEach>
        </table>
    </div>
</body>

</html>