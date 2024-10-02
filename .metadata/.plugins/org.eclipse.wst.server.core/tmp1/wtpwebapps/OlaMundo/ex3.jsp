<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conta</title>
</head>
<body>
	<%
		// INICIO
		out.print("<h1>Conta poupança</h1>");
		out.print("<div>Depósito: R$ 1000,00</div>");
		out.print("<div>Juros: 0,7% a.m</div>");
		
		// VARIÁVEIS
		int valor_deposito = 1000;
		double taxa = 0.7;
		int anos = 5;
		int total_meses = anos * 12;
		double valor_total = valor_deposito;
		
		for (var i = 1; i <= total_meses; i++){
			valor_total += valor_total * (taxa / 100);
		}
		
		// FINAL
		String valor_total_formatado = String.format("%.2f", valor_total);
		out.print("<div>Valor total em 5 anos: R$ " + valor_total_formatado + "</div>");
	%>
</body>
</html>