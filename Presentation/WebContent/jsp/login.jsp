<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
	<h3>Login</h3>
	<form name=formLogin method="post">
		<table>
			<tr>
				<td>Identifiant:</td>
				<td><input type="text" name="login"></td>
			</tr>
			<tr>
				<td>Mot de passe:</td>
				<td><input type="password" name="psswd"></td>
			</tr>
			<tr>
                <td colspan="2" align="center"><input type="submit" name="envoyer" value="Envoyer"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">Pas encore enregistrer? <a href="/creerUnCompte">Creer un compte!</a></td>
            </tr>
		</table>
	</form>

</body>
</html>