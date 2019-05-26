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
    <h1>История аренды ${name}</h1>
</body>

<div>
   <table border="1">
      <tr>
         <th>Арендатор</th>
         <th>Дата начала аренды</th>
         <th>Дата окончания аренды</th>
      </tr>
      <c:forEach  items="${history}" var ="item">
         <tr>
             <td>${item.renter}</td>
             <td>${item.dateBegin}</td>
             <td>${item.dateEnd}</td>
         </tr>
      </c:forEach>
   </table>
</div>
 
</html>