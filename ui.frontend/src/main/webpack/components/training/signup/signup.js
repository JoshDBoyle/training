$('#signup').click(function(e) {
    $.post('/bin/training/signup', function(response = {title: response.title, description: response.description}) {

        console.log("Response", response);

        // let res = JSON.stringify(response);
        //
        // console.log("Response", res,title);

        $('#suTitle').text(response.title);
        $('#suDescription').text(response.description);

       // alert('Thanks!  We\'ve got you signed up as of ' + JSON.stringify(response));

    }).fail(function() {
        alert('Unfortunately, something went wrong.');
    });
});