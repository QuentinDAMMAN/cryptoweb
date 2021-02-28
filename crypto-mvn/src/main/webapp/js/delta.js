"use strict"
$(function() {

	// var $delta = $(".delta");



	// $delta.each(function() {
	//     var cellText = $(this).html(); 
	//     console.log(cellText);
	// });



	var deltaMap = $(".delta").map(function() {
		var cellText = $(this).text();
		console.log(cellText);
		if (cellText > 0) {
			$(this).css("background-color", "green");
		} else if (cellText < 0) {
			$(this).css("background-color", "red");
		} else {
			$(this).css("background-color", "darkgrey");

		}


	});


	// $('.myTableClass td').each(function() {
	//     var cellText = $(this).html();
	//     console.log(cellText)    
	// });


	//	if ($(".delta1") > 0) {
	//		$(".delta1").css("background-color", "green");
	//	} else if ($(".delta1") < 0) {
	//		$(".delta1").css("background-color", "red");
	//	} else {
	//		$(".delta1").css("background-color", "darkgrey");
	//
	//	}


	var deltaMap1 = $(".delta1").map(function() {
		var cellText1 = $(this).text();
		console.log(cellText1);
		if (cellText1 > 0) {
			$(".delta1").css("color", "green");
		} else if (cellText1 < 0) {
			$(".delta1").css("color", "red");
		} else {
			$(this).css("color", "darkgrey");

		}


	});




});



