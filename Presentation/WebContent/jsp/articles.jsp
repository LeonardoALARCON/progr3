<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h3>Catalogue des articles</h3>
<table border="1">
	<thead>
		<tr>
			<th>Code</th>
			<th>Nom</th>
			<th>Prix</th>
			<th>Stock</th>
			<th>Commander</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${sessionScope.articles}" var="article">
          <tr>
            <td>${ article.code }</td>
            <td>${ article.nom }</td>
            <td>${ article.prix }</td>
            <td>${ article.stock }</td>
            <td>
              <form method="post" action="#">
                Quantité: <input type="number" name="quantite" value="1" min="1" max="${ article.stock }" required />
                <input type="submit" name="commander" value="commander" />
                <input type="hidden" name="codeArticle" value="${ article.code }" />
              </form>
            </td>
          </tr>
     </c:forEach>
	</tbody>
</table>
