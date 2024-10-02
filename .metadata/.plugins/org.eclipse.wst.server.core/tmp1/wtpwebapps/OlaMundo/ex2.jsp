<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sequência Fibonacci</title>
</head>
<body>
	<%
	out.print("<h1>Sequência Fibonacci</h1>");
	
	var valor_atual = 0;
	var valor_anterior1 = 1;
	var valor_anterior2 = 0;
	
	for (var i = 1; i <= 20; i++) {
		valor_atual = valor_anterior1 + valor_anterior2;
		valor_anterior1 = valor_anterior2;
		valor_anterior2 = valor_atual;
		out.print("<div>" + valor_atual + "</div>");
	}
	%>
</body>
</html>