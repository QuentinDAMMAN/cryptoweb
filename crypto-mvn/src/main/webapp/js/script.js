"use strict"
$(function(){

	
	

	// ajout
	var $ajoutModal = $("#ajouterModal");
	var $ajouter = $("#ajouter");
	var $closeModalAdd = $("#closeModalAdd");
	var $submitModalAdd = $("#submitModalAdd");

	$ajoutModal.click(function() {
		$ajouter.css("display", "flex");
		console.log("click => ajouter !");
	});

	$closeModalAdd.click(function(){
		$ajouter.css("display", "none");
		console.log("close => modal ajouter !");
	});

	$submitModalAdd.click(function(){
		$ajouter.css("display", "none");
		console.log("modal ajouter => donnée transférer !");
	});

	// modifier
	var $modifierModal = $("#modifierModal");
	var $modifier = $("#modifier");
	var $closeModalUpd = $("#closeModalUpd");
	var $submitModalUpd = $("#submitModalUpd");
	

	$modifierModal.click(function() {
		$modifier.css("display", "flex");
		console.log("click => modifier !");
	});

	$closeModalUpd.click(function(){
		$modifier.css("display", "none");
		console.log("close => modal modifier !");
	});

	$submitModalUpd.click(function(){
		$modifier.css("display", "none");
		console.log("modal modifier => donnée transférer !");
	});

	// supprimer
	var $supprimerModal = $("#supprimerModal");
	var $supprimer = $("#supprimer");
	var $closeModalDel = $("#closeModalDel");
	var $submitModalDel = $("#submitModalDel");

	$supprimerModal.click(function() {
		$supprimer.css("display", "flex");
		console.log("click => supprimer !")
	});

	$closeModalDel.click(function(){
		$supprimer.css("display", "none");
		console.log("close => modal supprimer !");

	});

	$submitModalDel.click(function(){
		$supprimer.css("display", "none");
		console.log("modal supprimer => donnée transférer !");
	});













});







