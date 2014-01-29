<%@ page import="java.util.*" %>
<%@ page import="fr.univnantes.iut.bean.Article" %>
<%@ page import="fr.univnantes.iut.service.Service" %>
<h3>Votre commande</h3>
<table border="1">
	<thead>
		<tr>
			<th>Code</th>
			<th>Nom</th>
			<th>Prix</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<%
				LinkedList<Article> commande = Service.getCommande();
			     for (Article a : commande) {
			    	    out.println("<td>" + a.getCode() + "</td><td>"
			    	    + a.getNom() + "</td><td>"
			            + a.getPrix() + "</td>");
			     }
			%>
		</tr>
	</tbody>
</table>
<a href="/association/annulerCommande">Annuler la commande</a>