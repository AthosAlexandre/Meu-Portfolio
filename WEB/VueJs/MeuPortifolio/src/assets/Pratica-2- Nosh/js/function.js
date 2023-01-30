$(function () {

  $('.navegacao-mobile').click(function (e) {
    e.stopPropagation();
    $(this).find('ul').slideToggle('fast');
  });

  $('body, html').click(function (e) {
    e.stopPropagation();
    $('.navegacao-mobile').find('ul').slideUp('fast');
  })

});