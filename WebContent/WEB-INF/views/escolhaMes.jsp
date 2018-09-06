<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Selecione um mês</h1>

<form action="mostraMes" method="POST">
							
	<select   name="qualMes"  >
		<option value="janeiro">JANEIRO</option>
		<option value="fevereiro">FEVEREIRO</option>
		<option>MARÇO</option>
		<option>ABRIL</option>
		<option>MAIO</option>
		<option>JUNHO</option>
		<option>JULHO</option>
		<option>AGOSTO</option>
		<option>SETEMBRO</option>
		<option>OUTUBRO</option>
		<option>NOVEMBRO</option>
		<option>DEZEMBRO</option>
	</select>
	<input type="submit" value="Verificar gasto">
	
</form>


</body>
</html>