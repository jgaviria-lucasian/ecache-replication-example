<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" 
	import="com.test.cache.CacheHelper, java.util.ArrayList, com.test.cache.ElementoVO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cache Ejemplo</title>
</head>
<body>

<form action="<%= request.getContextPath()%>/Adicionar">
Llave <input type="text" name="id" id="id"> Valor <input type="text" name="valor" id="valor"> <input type="submit" value="Enviar"/> 
</form>

<table>
	<tr>
		<td><b>Llave</b></td>
		<td><b>Valor</b></td>
		<td></td>
	</tr>
	<%
	CacheHelper cacheHelper= new CacheHelper();
	ArrayList<ElementoVO> elementos= cacheHelper.getAll();	
	for (ElementoVO elemento : elementos) { %>
	<tr>
		<td><%= elemento.getId() %></td>
		<td><%= elemento.getValor() %></td>
		<td><a href="<%= request.getContextPath()%>/Eliminar?id=<%= elemento.getId() %>">Eliminar</td>
	</tr>	
	<% } %>
	
</table>

</body>
</html>