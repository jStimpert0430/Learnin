//Joshua Stimpert - week 9 GA - Web Development with Javascript - fall 2019

$(document).ready(function()
    {
        $('#place').change(function()
        {
            let placeSelected = $('#place').val(); //keyword val

            if( placeSelected === "palaces")
            {
                $('.palace').addClass('visible');  //jquery command addClass
                $('.palace').removeClass('invisible'); //jquery command removeClass
                $('.keyItems').addClass('invisible');
                $('.weapons').addClass('invisible');
                $('.selectAll').addClass('invisible');
            }

            if( placeSelected === "keyItems")
            {
                $('.palace').addClass('invisible');
                $('.keyItems').addClass('visible');
                $('.keyItems').removeClass('invisible');
                $('.weapons').addClass('invisible');
                $('.selectAll').addClass('invisible');
            }

            if( placeSelected === "weapons")
            {
                $('.palace').addClass('invisible');
                $('.keyItems').addClass('invisible');
                $('.weapons').addClass('visible');
                $('.weapons').removeClass('invisible');
                $('.selectAll').addClass('invisible');
            }

            if( placeSelected === "All")
            {
                $('.place').removeClass('invisible');
                $('.place').addClass('visible');
            }
    });
});
