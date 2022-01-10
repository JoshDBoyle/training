$('#signup').click(function(e) {
    $.post('/bin/training/signup', function(response = {title: response.title, description: response.description}) {

        console.log("Response", response);

        $('#suTitle').text(response.title);
        $('#suDescription').text(response.description);

    }).fail(function() {
        alert('Unfortunately, something went wrong.');
    });
});