<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel='stylesheet' type='text/css' href="${pageContext.servletContext.contextPath}/css/style.css" />
</head>
<body>
<div>
  <h3 id="message">${sessionScope.message}</h3>
</div>
<div id="formulaireAuthentification" class="center">
<form id="formReg" name="formRegister" method="post">
	<table>
		<tr>
			<td>Identifiant:</td>
			<td>
			 <input type="text" name="login" size="20" maxlength="20" required><small>*</small>
			</td>
		</tr>
		<tr>
			<td>Mot de passe:</td>
			<td>
			 <input id="mdp" type="password" name="psswd" size="20" maxlength="20" required><small>*</small>
			</td>
		</tr>
		<tr>
      <td>Mot de passe:</td>
      <td>
       <input id="mdpConf" type="password" name="psswdConf" size="20" maxlength="20" required><small>*</small>
      </td>
    </tr>
    <tr>
      <td>Nom:</td>
      <td>
       <input type="text" name="nom" value="${sessionScope.adherent.nom}" size="20" maxlength="20" required><small>*</small>
      </td>
    </tr>
    <tr>
      <td>Prénom:</td>
      <td>
       <input type="text" name="prenom" value="${sessionScope.adherent.prenom}" size="20" maxlength="20" required><small>*</small>
      </td>
    </tr>
    <tr>
      <td>Adresse:</td>
      <td>
       <input type="text" name="adresse"  value="${sessionScope.adherent.adresse}" size="20" maxlength="60">
      </td>
    </tr>
    <tr>
      <td>Code Postal:</td>
      <td>
       <input type="text" name="codepostal" value="${sessionScope.adherent.codePostal}" size="10" maxlength="5">
      </td>
    </tr>
        <tr>
      <td>Ville:</td>
      <td>
       <input type="text" name="ville" value="${sessionScope.adherent.ville}" size="10" maxlength="5">
      </td>
    </tr>
    <tr>
      <td>Pays:</td>
      <td>
       <select name="pays">
	        <option value="">Selectionez un pays</option>
	        <option value="États Unis">États Unis</option>
	        <option value="France">France</option>
	        <option value="Mexique">Mexique</option>
       </select>
      </td>
    </tr>
		<tr>
			<td colspan="2" align="center"><button onClick="motPasseEgals();" >Enregistrer</button></td>
		</tr>
		<tr>
		  <td><small>*</small>Champs Obligatoires</td>
		</tr>
	</table>
</form>
</div>
<script>
function motPasseEgals(){
	mdp = document.getElementById("mdp");
	mdpConf = document.getElementById("mdpConf");
	if(mdp.value != mdpConf.value){
		document.getElementById("message").innerText = "Les mot de passe sont differents";
	}
	else{
		document.getElementById("formReg").submit();
	}
}
</script>
</body>
</html>