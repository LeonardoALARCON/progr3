<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="head">
	<table border="1" id="menu">
		<tr>
			<th><a
				href="<%=getServletContext().getContextPath()%>/association/accueil">Accueil</a></th>
			<th><a
				href="<%=getServletContext().getContextPath()%>/association/articles">Articles</a></th>
			<th><a
				href="<%=getServletContext().getContextPath()%>/association/commande">Commande</a></th>
			<th width="100%"></th>
			<th align="right" width="200px"><c:if test="${empty sessionScope.login }">
				Non authentifié
			</c:if> ${sessionScope.login.nom}</th>
		</tr>
	</table>
</div>
=======
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
			${sessionScope.login}
		</th>
	</tr>
</table>
>>>>>>> 5b21113db36c68d9072a47358105913522e8679f
