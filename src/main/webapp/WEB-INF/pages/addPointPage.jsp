<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body>
<form action="${pageContext.request.contextPath}/add-Point" method="POST" >
<label>Имя точки</label>
<input type="text" name="title">
<input type="submit" value="Добавить новую точку">
</form>
</body>  
</html>