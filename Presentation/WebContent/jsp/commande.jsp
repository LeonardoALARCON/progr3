<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h3>Votre commande</h3>
<table border="1">
    <thead>
        <tr>
            <th>Code</th>
            <th>Nom</th>
            <th>Prix</th>   
            <th>Quantité</th>
            <th>Total</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <c:forEach items="${sessionScope.commandes}" var="commande">
          <tr>
            <td>${ commande.article.code }</td>
            <td>${ commande.article.nom }</td>
            <td>${ commande.article.prix }</td>
            <td>${ commande.quantite }</td>
            <td>${commande.quantite * commande.article.prix }</td>
          </tr>
     </c:forEach>
        </tr>
    </tbody>
</table>
<a href="${pageContext.servletContext.contextPath}/association/annulerCommande">Annuler la commande</a>
