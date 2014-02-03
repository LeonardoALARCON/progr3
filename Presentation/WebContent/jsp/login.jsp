<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
  pageEncoding="UTF-8"%>
=======
	pageEncoding="UTF-8"%>
>>>>>>> 41ff946a69520d6fb79c9e9e7370c164a4ceae0d
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<<<<<<< HEAD
<link rel='stylesheet' type='text/css'
    href="<%=getServletContext().getContextPath()%>/css/style.css" />
<title>Template</title>
</head>
<body>
<h3>Login</h3>
=======
<title>Login</title>
<link rel='stylesheet' type='text/css' href="${pageContext.servletContext.contextPath}/css/style.css" />
</head>
<body>
<h3>Login</h3>
<div id="authentification" class="center">
>>>>>>> 41ff946a69520d6fb79c9e9e7370c164a4ceae0d
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
<<<<<<< HEAD
			<td colspan="2" align="center">Pas encore enregistrer? <a

				href="/association/nouveauadherent">Creer un compte!</a></td>
		</tr>
	</table>
</form>
=======
			<td colspan="2" align="center">Pas encore enregistré? 
			<a href="${pageContext.servletContext.contextPath}/association/nouveauadherent">Creer un compte!</a></td>
		</tr>
	</table>
</form>
</div>
>>>>>>> 41ff946a69520d6fb79c9e9e7370c164a4ceae0d
</body>
</html>
