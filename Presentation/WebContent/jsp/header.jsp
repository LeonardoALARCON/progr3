<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table border="1">
	<tr>
		<th>Accueil</th>
		<th>Articles</th>
		<th>Commande</th>
		<th></th>
		<th align='right'>
			<%if (request.getSession().getAttribute("login") != null) {%>
            <%=request.getSession().getAttribute("login")%>
            <%}else%>Non authentifi�
		</th>
	</tr>
</table>
