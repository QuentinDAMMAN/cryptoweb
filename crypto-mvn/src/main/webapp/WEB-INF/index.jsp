<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Portefeuille</title>
<link rel="stylesheet" href="css/style.css">
</head>



<body>


	<div class="header fixed-top">
		<div class="top-header">
			<div class="flex-column flex-md-row ">
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
								<a class="nav-item nav-link active mr-5 ml-5" href="${ index }"
									style="color: rgba(255, 255, 255, 0.575) !important;">LES
									CRYPTO-MONNAIES</a>
							</div>
							<div>
								<c:url value="portefeuille" var="portefeuille"></c:url>
								<a class="nav-item nav-link active mr-5 ml-5"
									href="${ portefeuille }">MON PORTEFEUILLE</a>
							</div>

							<div class="dropdown">
								<button class="btn btn-secondary dropdown-toggle" type="button"
									data-toggle="dropdown">Actions Cryptos</button>
								<div class="dropdown-menu">
									<a class="dropdown-item" id="ajouterModal" href="#">Ajouter</a>
									<a class="dropdown-item" id="modifierModal" href="#">Modifier
										prix</a> <a class="dropdown-item" id="supprimerModal" href="#">Supprimer</a>
								</div>
							</div>


						</div>
					</div>
				</nav>
			</div>
		</div>
	</div>

	<div id="ajouter" class="modal" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">Ajouter une cryptomonnaie</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="/crypto-mvn/ajout" method="post">
						<label for="nom">Nom : </label> <input type="text" name="nom">
						<br> <label for="label">Label : </label> <input type="text"
							name="label"> <br> <label for="prix">Prix
							actuel : </label> <input type="number" step="0.01" name="prix">
						<button id="submitModalAdd" type="submit" class="btn btn-primary">Save
							changes</button>
					</form>
				</div>
				<div class="modal-footer">
					<button id="closeModalAdd" type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
	<div id="modifier" class="modal" tabindex="0" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">Modifier le prix actuel d'une
						cryptomonnaie</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="/crypto-mvn/prix" method="post">
						<br> <label for="label">Label : </label> <input type="text"
							name="label"> <br> <label for="prix">Nouveau
							prix : </label> <input type="number" step="0.01" name="prix">
						<button id="submitModalUpd" type="submit" class="btn btn-primary">Save
							changes</button>
					</form>
				</div>
				<div class="modal-footer">
					<button id="closeModalUpd" type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
	<div id="supprimer" class="modal" tabindex="1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">Modifier le prix actuel d'une
						cryptomonnaie</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="/crypto-mvn/supp" method="post">
						<label for="label">Label : </label> <input type="text"
							name="label">
						<button id="submitModalDel" type="submit" class="btn btn-primary">Save
							changes</button>
					</form>
				</div>
				<div class="modal-footer">
					<button id="closeModalDel" type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>


	<br>
	<br>
	<br>
	<div class=" container-fluid tableau p-0">

		<table class="table table-dark text-center">
			<thead class="head-tableau">
				<tr>
					<th scope="col">ID</th>
					<th scope="col">NOM</th>
					<th scope="col">LABEL</th>
					<th scope="col">PRIX ACTUEL</th>
					<th scope="col">ACHETER</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${cryptomonnaies }" var="cryptomonnaies"
					varStatus="vs">

					<tr class="centrer">
						<th scope="row">${cryptomonnaies.id }</th>
						<td>${cryptomonnaies.nom }</td>
						<td>${cryptomonnaies.label }</td>
						<td>${cryptomonnaies.prixActuel }</td>
						<td>
							<div class="boutton-swag span4 proj-div"
								id="ajouterModal${vs.index}" href="#" data-toggle="modal"
								data-target="#acheter${vs.index}">
								<a href="#">
									<p>
										<span class="bg"></span><span class="base"></span><span
											class="text">BUY</span>
									</p>
								</a>
							</div>
						</td>
					</tr>

					<div id="acheter${vs.index}" class="modal" tabindex="-1"
						role="dialog">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<h5 class="modal-title">ACHAT ${cryptomonnaies.label }</h5>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<div class="modal-body">
									<form method="post" action="/crypto-mvn/achat">
										<p>Prix actuel : ${cryptomonnaies.prixActuel }</p>

										<label for="label">Confirmez le label : </label> <input
											type="text" name="label"> <br> <label for=prix>Valeur
											: </label> <input type="number" step="0.01" name="prix">
										<button id="submitModalDel" type="submit"
											class="btn btn-primary">ACHETER</button>
									</form>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>


			</tbody>
		</table>

	</div>

	<script src="js/gestionsClickModal.js"></script>
</body>
</html>