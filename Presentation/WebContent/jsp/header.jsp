<<<<<<< HEAD
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
=======
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="head">
	<table border="1" id="menu">
		<tr>
			<th><a
				href="${pageContext.servletContext.contextPath}/association/accueil">Accueil</a></th>
			<th><a
				href="${pageContext.servletContext.contextPath}/association/articles">Articles</a></th>
			<th><a
				href="${pageContext.servletContext.contextPath}/association/commande">Commande</a></th>
			<th width="100%"></th>
			<th align="right" width="200px">
			<c:choose>
				<c:when test="${! empty sessionScope.login }">
					<form name="logoutForm" method="post">
					 ${sessionScope.login}
					 <input type="submit" name="logout" value="Déconnexion" />
					</form>
				</c:when>
				<c:otherwise>
				  Non authentifié
				</c:otherwise> 
			</c:choose>
			</th>
		</tr>
	</table>
</div>
>>>>>>> 41ff946a69520d6fb79c9e9e7370c164a4ceae0d
