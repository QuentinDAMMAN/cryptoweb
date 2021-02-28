"use strict"
$(function(){

    // var $delta = $(".delta");



    // $delta.each(function() {
    //     var cellText = $(this).html(); 
    //     console.log(cellText);
    // });



    var deltaMap = $(".delta").map(function() {
        var cellText =  $(this).text();
        console.log(cellText);
        if(cellText > 0){
            $(this).css("background-color","green");
        } else if(cellText < 0){
            $(this).css("background-color","red");
        } else{
            $(this).css("background-color","darkgrey");

        }

        
    });


    // $('.myTableClass td').each(function() {
    //     var cellText = $(this).html();
    //     console.log(cellText)    
    // });
});