$('#signup').click(function(e) {
    $.post('/bin/training/signup', function(response) {
        alert('Thanks!  We\'ve got you signed up as of ' + response);
    }).fail(function() {
        alert('Unfortunately, something went wrong.');
    });
});