<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Portefeuille</title>
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
									href="${ portefeuille }" style="color: rgba(255, 255, 255, 0.575)!important;">MON PORTEFEUILLE</a>
							</div>
							<div>
								<c:url value="historique" var="historique"></c:url>
								<a class="nav-item nav-link active mr-5 ml-5"
									href="${ historique }">MON HISTORIQUE</a>
							</div>
						</div>
					</div>
				</nav>
			</div>
		</div>
	</div>

</body>

</html>