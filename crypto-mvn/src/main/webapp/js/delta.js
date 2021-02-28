"use strict"
$(function() {
var deltaMap = $(".delta").map(function() {
        var cellText =  $(this).text();
        if(cellText > 0){
            $(this).css("background-color","green");
        } else if(cellText < 0){
            $(this).css("background-color","red");
        } else{
            $(this).css("background-color","darkgrey");
        }
    });
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