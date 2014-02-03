<%@ page import="java.util.*" %>
<%@ page import="fr.univnantes.iut.bean.Article" %>
<%@ page import="fr.univnantes.iut.service.Service" %>
<h3>Catalogue des articles</h3>
<table border="1">
	<thead>
		<tr>
			<th>Code</th>
			<th>Nom</th>
			<th>Prix</th>
			<th>Stoque</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<%
                LinkedList<Article> catalogue = Service.getCatalogue();
                 for (Article a : catalogue) {
                        out.println("<td>" + a.getCode() + "</td><td>"
                        + a.getNom() + "</td><td>"
                        + a.getPrix() + "</td><td>"
                        + a.getStock() + "</td><td>"
                        + "<a href='"+getServletContext().getContextPath()+"/association?commande="+a.getCode()+"'>Commander</a>");
                 }
            %>
		</tr>
	</tbody>
</table>
