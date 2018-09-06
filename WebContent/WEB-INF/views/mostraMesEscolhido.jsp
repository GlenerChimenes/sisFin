<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mostrando o mes</title>
</head>
<body>
<h2>Mes ${xpto}</h2>
	
	<table>
	<tr>
		<td>id:</td>
		<td>Mes:</td>
		<td>Descrição:</td>
		<td>Local</td>
		<td>Valor</td>
		<td>Data</td>
		
		
	</tr>
	
	<c:forEach  items="${meses}" var="mes">
	
	</c:forEach>
	
	</table>

</body>
</html>