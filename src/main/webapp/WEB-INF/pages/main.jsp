<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

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

<a href="${pageContext.request.contextPath}/addPoint">Добавить точку проката</a>
 
</html>