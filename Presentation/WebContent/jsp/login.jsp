<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- link rel='stylesheet' type='text/css'  href="${pageContext.servletContext.contextPath}/css/style.css" / -->
<title>Login</title>
</head>
<body>
<h3>Login</h3>
<form name="formLogin" method="post">
	<table>
		<tr>
			<td>Identifiant:</td>
			<td><input type="text" name="login" size="10" maxlength="20" required></td>
		</tr>
		<tr>
			<td>Mot de passe:</td>
			<td><input type="password" name="psswd" size="10" maxlength="20" required></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				name="envoyer" value="Envoyer"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">Pas encore enregistrer? 
			<a href="${pageContext.servletContext.contextPath}/association/nouveauadherent">Creer un compte!</a></td>
		</tr>
	</table>
</form>
</body>
</html>
