// A $( document ).ready() block.
$( document ).ready(function() {

    console.log( "ready!" );

    $.get('/bin/training/adventureMap', function (response) {

        console.log("RESPONSE", response);

        $('.iconA1').removeClass().addClass(`icon solid major ${response.iconA1}`);
        $('.iconA2').removeClass().addClass(`icon solid major ${response.iconA2}`);
        $('.iconA3').removeClass().addClass(`icon solid major ${response.iconA3}`);
        $('.iconB1').removeClass().addClass(`icon solid major ${response.iconB1}`);
        $('.iconB2').removeClass().addClass(`icon solid major ${response.iconB2}`);
        $('.iconB3').removeClass().addClass(`icon solid major ${response.iconB3}`);


    }).fail(function() {
        alert('Unfortunately, something went wrong.');
    });
});




