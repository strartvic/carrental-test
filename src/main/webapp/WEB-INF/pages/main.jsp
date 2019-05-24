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
    width: 100%;
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
    <h1>Добро пожаловать на сайт проката автомобилей!</h1>
</body>

<div>
   <table border="1">
      <tr>
         <th>Точки проката</th>
         <th>Действия</th>
      </tr>
      <c:forEach  items="${points}" var ="point">
         <tr>
             <td>${point.name}</td>
             <td>${point.lastName}</td>
         </tr>
      </c:forEach>
   </table>
</div>

<a href="${pageContext.request.contextPath}/add-Point">Добавить точку проката</a>
 
</html>