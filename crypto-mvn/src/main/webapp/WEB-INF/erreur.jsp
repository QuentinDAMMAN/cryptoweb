
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

>
			<h1 class="text-center">
				<%=request.getAttribute("message")%>
			</h1>




	<div>
		<c:url value="index" var="index"></c:url>
		<a class="nav-item nav-link active mr-5 ml-5" href="${ index }"
			style="color: rgba(0, 0, 0) !important;"><button
				class="btn btn-dark btn-lg btn-block">Retour à l'accueil</button> </a>
	</div>

</body>
</html>