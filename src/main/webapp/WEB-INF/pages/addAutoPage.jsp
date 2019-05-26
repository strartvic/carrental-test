<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body>
<form action="${pageContext.request.contextPath}/add-auto" method="POST" >
<label>Модель авто</label>
<input type="text" name="carModel">
<label>Номер</label>
<input type="text" name="number">
<input type="submit" value="Добавить новое авто">
</form>
</body>  
</html>