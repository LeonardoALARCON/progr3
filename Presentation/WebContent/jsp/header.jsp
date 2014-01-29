<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="head">
	<table border="1" id="menu">
		<tr>
			<th><a
				href="<${pageContext.servletContext.contextPath}/association/accueil">Accueil</a></th>
			<th><a
				href="${pageContext.servletContext.contextPath}/association/articles">Articles</a></th>
			<th><a
				href="${pageContext.servletContext.contextPath}/association/commande">Commande</a></th>
			<th width="100%"></th>
			<th align="right" width="200px"><c:if test="${empty sessionScope.login }">
				Non authentifié
			</c:if> ${sessionScope.login}</th>
		</tr>
	</table>
</div>
