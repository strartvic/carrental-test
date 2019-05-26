<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body>
<form action="${pageContext.request.contextPath}/rent-auto/${carModel}" method="POST" >
<label>Арендатор</label>
<input type="text" name="renter">
<div>
<label>Дата начала аренды</label>
<input type="date" name="dateBegin">
</div>
<label>Дата окончания аренды</label>
<input type="date" name="dateEnd">
<input type="submit" value="Арендовать">
</form>
</body>  
</html>