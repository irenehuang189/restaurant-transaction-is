<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta name="description" content="Bandung Web Kit" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <title>Bon | Waroeng Steak and Shake</title>

    <link rel="icon" type="image/png" href="img/logo-navbar.jpg" />
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css" />
    <link rel="stylesheet" href="css/style.css" />
  </head>
  <body class="yellow">

    <!-- Navbar -->
    <nav>
      <div class="nav-wrapper black">
        <a class="brand-logo">
          <img class="responsive-img" src="img/logo-navbar.jpg" />
        </a>
        <ul class="right hide-on-med-and-down">
          <li><a id="rekapitulasi-btn" class="waves-effect waves-light btn yellow black-text">REKAPITULASI</a></li>
          <li><a href="pembayaran.html" class="waves-effect waves-light btn yellow black-text">PEMBAYARAN</a></li>
          <li><a href="index.html" class="waves-effect waves-light btn red">KELUAR</a></li>
        </ul>
      </div>
    </nav>
    <!-- /Navbar -->

    <!-- Body -->
    <div>
      <div class="row">
        <!-- Card Bon -->
        <div class="col l5 offset-l3">
          <div class="card-panel black-text">
            <h4 class="row center-align">Waroeng Steak and Shake</h4>
            <h6 class="row center-align">Jl. Tamansari No. 21, Bandung</h6>
            <!-- Informasi meja dan waktu -->
            <div class="row">
              <div id="meja" class="col l6">Meja 10</div>
              <div class="col l6 right-align">30/12/2015 20:00</div>
            </div>
            <hr>

            <!-- Menu yang dibayar -->
            <div class="row">
              <div class="col l1">5</div>
              <div class="col l8">Chicken Gordeon Bleu</div>
              <div class="col l3 right-align">Rp100.000,00</div>
            </div>
            <div class="row">
              <div class="col l1">3</div>
              <div class="col l8">Steak Waroeng</div>
              <div class="col l3 right-align">Rp60.000,00</div>
            </div>
            <div class="row">
              <div class="col l1">1</div>
              <div class="col l8">Milkshake Strawberry</div>
              <div class="col l3 right-align">Rp12.000,00</div>
            </div>
            <div class="row">
              <div class="col l1">2</div>
              <div class="col l8">Lemon Tea</div>
              <div class="col l3 right-align">Rp8.500,00</div>
            </div>
            <hr>

            <!-- Subtotal -->
            <div class="row bottom">
              <div class="col l9">SUBTOTAL</div>
              <div class="col l3 right-align">Rp180.500,00</div>
              <div class="col l9">PAJAK</div>
              <div class="col l3 right-align">Rp18.050,00</div>
            </div>
            <hr>

            <!-- Total -->
            <div class="row">
              <div class="col l9">TOTAL</div>
              <div class="col l3 right-align">Rp198.550,00</div>
              <div class="col l8">BAYAR</div>
              <div class="col l1 right-align">Rp</div>
              <div class="col l3">
                <input type="number" id="bayar" class="validate right-align no-padding" placeholder="xxxxxx"/>
              </div>
            </div>
            <hr>

            <!-- Kembali -->
            <div class="row">
              <div class="col l9">KEMBALI</div>
              <div id="kembali" class="col l3 right-align">_________</div>
            </div>
            <div class="right-align">
              <a id="hitung-btn" class="waves-effect waves-light btn yellow black-text">HITUNG</a>
              <a id="cetak-btn" class="waves-effect waves-light btn red">CETAK</a>
            </div>
          </div>
        </div>
        <!-- /Card Bon -->
      </div>
    </div>
    <!-- /Body -->

    <!-- JavaScript -->
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>
    <script text="text/javascript" src="js/script.js"></script>
  </body>
</html>