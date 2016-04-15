// Function for getting url parameter
var getUrlParameter = function getUrlParameter(sParam) {
    var sPageURL = decodeURIComponent(window.location.search.substring(1)),
        sURLVariables = sPageURL.split('&'),
        sParameterName,
        i;

    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');

        if (sParameterName[0] === sParam) {
            return sParameterName[1] === undefined ? true : sParameterName[1];
        }
    }
};

$(document).ready(function(){
  // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
  $('.modal-trigger').leanModal();

  // Login
  $("#login-btn").click(function() {
    var username = $("#username").val();
    var password = $("#password").val();
    if ((username=="dapur" && password=="dapur") || (username=="minum" && password=="minum")) {
      window.location.replace("pesanan.html");
    } else if (username=="kasir" && password=="kasir") {
      window.location.replace("pembayaran.html");
    } else if ((username=="pjdapur" && password=="pjdapur") || (username=="pjminum" && password=="pjminum") || (username=="manoutlet" && password=="manoutlet")) {
      window.location.replace("rekapitulasi.html");
    } else {
      alert("Username dan/atau password salah.");
    }
  });

  // Membuat bon
  var no_meja = getUrlParameter("meja");
  $("#meja").html("Meja " + no_meja);

  // Tekan tombol cetak
  $("#hitung-btn").click(function() {
    var total = 198550;
    var bayar = $("#bayar").val();
    var kembali = bayar - total;
    $("#kembali").html("Rp" + kembali + ",00");
  });
  $("#cetak-btn").click(function() {
    window.location.replace("pembayaran.html?meja=" + no_meja);
  });
  $("#rekapitulasi-btn").click(function() {
    window.location.replace("rekapitulasi.html?meja=" + no_meja);
  })
  $("#pembayaran-btn").click(function() {
    window.location.replace("pembayaran.html?meja=" + no_meja);
  })

  // Menghilangkan card meja di url
  $("#" + no_meja).remove();

  // Memasang tanggal hari ini pada datepicker
  $(".datepicker").val("2015-04-01");
});