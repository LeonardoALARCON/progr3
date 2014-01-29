
<div id="formulaireAuthentification" class="center">
<form name="formRegister" method="post">
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
			 <input type="password" name="psswd" size="20" maxlength="20" required><small>*</small>
			</td>
		</tr>
		<tr>
      <td>Mot de passe:</td>
      <td>
       <input type="password" name="psswdConf" size="20" maxlength="20" required><small>*</small>
      </td>
    </tr>
    <tr>
      <td>Nom:</td>
      <td>
       <input type="text" name="nom" size="20" maxlength="20" required><small>*</small>
      </td>
    </tr>
    <tr>
      <td>Prénom:</td>
      <td>
       <input type="text" name="prenom" size="20" maxlength="20" required><small>*</small>
      </td>
    </tr>
    <tr>
      <td>Adresse:</td>
      <td>
       <input type="text" name="adresse" size="20" maxlength="60">
      </td>
    </tr>
    <tr>
      <td>Code Postal:</td>
      <td>
       <input type="text" name="codepostal" size="10" maxlength="5">
      </td>
    </tr>
        <tr>
      <td>Ville:</td>
      <td>
       <input type="text" name="ville" size="10" maxlength="5">
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
			<td colspan="2" align="center"><input type="submit"
				name="envoyer" value="Enregistrer"></td>
		</tr>
		<tr>
		  <td><small>*</small>Champs Obligatoires</td>
		</tr>
	</table>
</form>
</div>