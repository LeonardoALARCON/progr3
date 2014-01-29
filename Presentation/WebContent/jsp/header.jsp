<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table>
	<tr>
		<th>Accueil</th>
		<th>Articles</th>
		<th>Commande</th>
		<th></th>
		<th align='right'>
			<c:if test="${empty sessionScope.login }">
				Non authentifié
			</c:if>
			${sessionScope.login.nom}
		</th>
	</tr>
</table>
