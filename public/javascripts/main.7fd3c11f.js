$(function (){
    console.log('JQuery ready!');

    function clearLabels() {
        $('#classification').removeClass('label-default label-primary label-success label-info label-warning label-danger');
    }

    $('#password').keyup(function (p) {
        console.log('Changed', p.target.value);
        $.post("/rate/", { password: p.target.value }).then(function(s) {
            console.log("Done", s);
            $('#score').html(Math.min(s, 100) + '%');

            clearLabels();

            if (s > 80) {
                $('#classification').addClass('label-primary');
                $('#classification').html('Very Strong');
            } else if (s > 60) {
                $('#classification').addClass('label-success');
                $('#classification').html('Strong');
            } else if (s > 40) {
                $('#classification').addClass('label-info');
                $('#classification').html('Medium');
            } else if (s > 20) {
                $('#classification').addClass('label-warning');
                $('#classification').html('Weak');
            } else {
                $('#classification').addClass('label-danger');
                $('#classification').html('Very Weak');
            }

        }, function (j, s, e) {
            console.error("Wololo" , e);
            $('#score').html('');
            clearLabels();
            $('#classification').addClass('label-default');
        });
    });
});