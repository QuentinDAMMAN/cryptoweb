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
				</nav>
				<div class="delta-position">
								<span class="delta-nav">DELTA TOTAL : 3939</span>
							</div>
						</div>
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
					<th scope="col">VENDRE</th>
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
						<td class="delta"
							style="transform: translateY(0%) !important; padding-top: 37px;">${cryptoportefeuille.delta }</td>
						<td>
							<div class="boutton-swag span4 proj-div"
								id="ajouterModal${vs.index}" href="#" data-toggle="modal"
								data-target="#vendre${vs.index}">
								<a href="#">
									<p>
										<span class="bg"></span><span class="base"></span><span
											class="text">SELL</span>
									</p>
								</a>
							</div>
						</td>
					</tr>
					<div id="vendre${vs.index}" class="modal" tabindex="-1"
						role="dialog">
						<div class="modal-dialog" role="document">
							<div class="modal-content"  style="width:375px;">
								<div class="modal-header">
									<h5 class="modal-title" style="margin-left:33%">VENDRE ${cryptoportefeuille.label}</h5>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<div class="modal-body">
									<form method="post" action="/crypto-mvn/vendre">
										<label for="label">Confirmez le label : </label> <input
											type="text" name="label"> <br> <label for=prix style="margin-left:83px;margin-bottom:30px">Valeur
											: </label> <input type="number" step="0.01" name="prix">
											<br>
										<button id="submitModalDel" type="submit"
											class="btn btn-primary bgd">Vendre</button>
											<button id="closeModalDel" type="button" class="btn btn-secondary droite"
                        data-dismiss="modal">Fermer</button>
									</form>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>


			</tbody>
		</table>

	</div>

	<script src="js/delta.js"></script>
</body>


</html>