<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table border="1">
	<tr>
		<th><a href="<%=getServletContext().getContextPath()%>/association/accueil">Accueil</a></th>
		<th><a href="<%=getServletContext().getContextPath()%>/association/catalogue">Articles</a></th>
		<th><a href="<%=getServletContext().getContextPath()%>/association/commande">Commande</a></th>
		<th></th>
		<th align='right'>
			<c:if test="${empty sessionScope.login }">
				Non authentifié
			</c:if>
			${sessionScope.login.nom}
		</th>
	</tr>
</table>
