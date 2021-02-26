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
								<a class="nav-item nav-link active mr-5 ml-5" href="${ index }" style="color: rgba(255, 255, 255, 0.575)!important;">LES
									CRYPTO-MONNAIES</a>
							</div>
							<div>
								<c:url value="portefeuille" var="portefeuille" ></c:url>
								<a class="nav-item nav-link active mr-5 ml-5"
									href="${ portefeuille }">MON PORTEFEUILLE</a>
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
              <tr class="centrer">
                <th scope="row">1</th>
                <td>Bitcoin </td>
                <td>BTC</td>
                <td>40000</td>
                <td><div class="boutton-swag"><a href="#">
                  <p><span class="bg"></span><span class="base"></span><span class="text">BUY</span></p>
                </a></td>
              </tr>
              <tr class="centrer">
                <th scope="row">2</th>
                <td>Cardano</td>
                <td>ADA</td>
                <td>0,90</td>
                <td><div class="boutton-swag"><a href="#">
                  <p><span class="bg"></span><span class="base"></span><span class="text">BUY</span></p>
                </a></td>
              </tr>
              <tr class="centrer">
                <th scope="row">3</th>
                <td>Ethereum</td>
                <td>ETH</td>
                <td>1200</td>
                <td><div class="boutton-swag"><a href="#">
                  <p><span class="bg"></span><span class="base"></span><span class="text">BUY</span></p>
                </a></td>
              </tr>
              
            </tbody>
          </table>

         </div>

</body>

</html>