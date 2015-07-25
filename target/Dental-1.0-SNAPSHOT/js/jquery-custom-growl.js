function growl(message, type) {
        var clazz = 'alert-' + type;
        $('.growl-custom').html(message).addClass(clazz).fadeIn(1000).fadeOut(2000);
    }