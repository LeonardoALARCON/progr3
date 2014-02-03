<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Template</title>
<link rel='stylesheet' type='text/css' href="${pageContext.servletContext.contextPath}/css/style.css" />
</head>
<body>
	<div id="corp" class="center">
		<table>
			<tr>
				<td><jsp:include page='/jsp/header.jsp' /></td>
			</tr>
			<tr>
				<td>
					<div class="center">
						<!-- main page -->
						<jsp:include page='/jsp/${requestScope.page}.jsp' />
					</div>
				</td>
		</table>
	</div>
	<div id="footer" class="center"></div>

</body>
</html>