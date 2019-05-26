<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 50%;
}
 
td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}
 
tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>
    <h1>${name}</h1>
</body>

<div>
   <table border="1">
      <tr>
         <th>Модель</th>
         <th>Номер</th>
         <th>Действия</th>
         <th>        </th>
         <th>        </th>
      </tr>
      <c:forEach  items="${autos}" var ="auto">
         <tr>
             <td>${auto.carModel}</td>
             <td>${auto.number}</td>
             <td><a href="${pageContext.request.contextPath}/delete-auto/${auto.carModel}">Удалить</a></td>
             <td><a href="${pageContext.request.contextPath}/rent-auto/${auto.carModel}">Взять в прокат</a></td>
             <td><a href="${pageContext.request.contextPath}/history-auto/${auto.carModel}">История</a></td>
         </tr>
      </c:forEach>
   </table>
</div>

<a href="${pageContext.request.contextPath}/add-auto">Добавить автомобиль</a>
 
</html>