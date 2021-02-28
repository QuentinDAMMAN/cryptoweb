<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Portefeuille</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>


	<div class="header">
		<div class="top-header">
			<div class="container-fluid p-0">
				<nav class="navbar navbar-expand-lg navbar-light bg-faded menu ">
					<a class="navbar-brand mr-5 marque" href="#">CRYPTOBASE</a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbarNavAltMarkup"
						aria-controls="navbarNavAltMarkup" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
						<div class="navbar-nav lien ">
							<div>
								<c:url value="index" var="index"></c:url>
								<a class="nav-item nav-link active mr-5 ml-5" href="${ index }">LES
									CRYPTO-MONNAIES</a>
							</div>
							<div>
								<c:url value="portefeuille" var="portefeuille"></c:url>
								<a class="nav-item nav-link active mr-5 ml-5"
									style="color: rgba(255, 255, 255, 0.575) !important;"
									href="${ portefeuille }">MON PORTEFEUILLE</a>
							</div>




						</div>
					</div>
				</nav>
			</div>
		</div>
	</div>
	<div class=" container-fluid tableau p-0">

		<table class="table table-dark text-center">
			<thead class="head-tableau">
				<tr>
					<th scope="col">DATE D'ACHAT</th>
					<th scope="col">LABEL</th>
					<th scope="col">NOMBRE D'UNITES</th>
					<th scope="col">VALEUR</th>
					<th scope="col">PRIX ACHAT</th>
					<th scope="col">PRIX ACTUEL</th>
					<th scope="col">DELTA</th>

				</tr>
			</thead>
			<tbody>

				<c:forEach items="${cryptoportefeuille }" var="cryptoportefeuille"
					varStatus="vs">

					<tr class="centrer">
						<th scope="row">${cryptoportefeuille.dateAchat }</th>
						<td>${cryptoportefeuille.label }</td>
						<td>${cryptoportefeuille.nombreUnite }</td>
						<td>${cryptoportefeuille.valeurAchat }</td>
						<td>${cryptoportefeuille.prixAchat }</td>
						<td>${cryptoportefeuille.prixActuel }</td>
						<td>${cryptoportefeuille.delta }</td>

					</tr>

				</c:forEach>


			</tbody>
		</table>

	</div>
</body>


</html>