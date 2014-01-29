<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 
On arrive sur cette page d’accueil après un login correct (mot de passe valide) ou une création de compte.
 -->
<title>Accueil</title>
</head>
<body>
	<!-- jsp:include page="/jsp/header.jsp"/-->
	<h2>Bienvenue sur le site des adhérants de l'association</h2>
	<ul>
		<li><a href="<%=getServletContext().getContextPath()%>/association/articles">
			Consulter les articles disponibles</a></li>
		<li><a href="<%=getServletContext().getContextPath()%>/association/commande">
			Consulter votre commande</a></li>
	</ul>
=======
</head>
<body>
	<!-- jsp:include page="/jsp/header.jsp"/-->
	<h2>Bienvenue sur le site des adh�rants de l'association</h2>
	<ul>
		<li><a href="${pageContext.servletContext.contextPath}/association/catalogue">
			Consulter les articles disponibles</a></li>
		<li><a href="${pageContext.servletContext.contextPath}/association/commande">
			Consulter votre commande</a></li>
	</ul>
>>>>>>> 5b21113db36c68d9072a47358105913522e8679f
