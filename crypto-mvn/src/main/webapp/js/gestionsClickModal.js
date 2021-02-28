"use strict"
$(function(){
	// ajout
	var $ajoutModal = $("#ajouterModal");
	var $ajouter = $("#ajouter");
	var $closeModalAdd = $("#closeModalAdd");
	var $submitModalAdd = $("#submitModalAdd");
	// modifier
	var $modifierModal = $("#modifierModal");
	var $modifier = $("#modifier");
	var $closeModalUpd = $("#closeModalUpd");
	var $submitModalUpd = $("#submitModalUpd");
	// supprimer
	var $supprimerModal = $("#supprimerModal");
	var $supprimer = $("#supprimer");
	var $closeModalDel = $("#closeModalDel");
	var $submitModalDel = $("#submitModalDel");
	$ajoutModal.click(function() {
		$ajouter.css("display", "flex");
		// console.log("click => ajouter !");
	});
	$modifierModal.click(function() {
		$modifier.css("display", "flex");
		// console.log("click => modifier !");
	});
	$supprimerModal.click(function() {
		$supprimer.css("display", "flex");
		// console.log("click => supprimer !")
	});
	$closeModalAdd.click(function(){
		$ajouter.css("display", "none");
		// console.log("close => modal ajouter !");
	});
	$closeModalUpd.click(function(){
		$modifier.css("display", "none");
		// console.log("close => modal modifier !");
	});
	$closeModalDel.click(function(){
		$supprimer.css("display", "none");
		// console.log("close => modal supprimer !");
	});
	$submitModalAdd.click(function(){
		$ajouter.css("display", "none");
		// console.log("modal ajouter => donnée transférer !");
	});
	$submitModalUpd.click(function(){
		$modifier.css("display", "none");
		// console.log("modal modifier => donnée transférer !");
	});
	$submitModalDel.click(function(){
		$supprimer.css("display", "none");
		// console.log("modal supprimer => donnée transférer !");
	});
});