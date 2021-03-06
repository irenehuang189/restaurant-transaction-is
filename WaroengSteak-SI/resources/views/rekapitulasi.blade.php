<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta name="description" content="Bandung Web Kit" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <title>Rekapitulasi | Waroeng Steak and Shake</title>

    <link rel="icon" type="image/png" href="img/logo-navbar.jpg" />
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" />
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
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
          <li><a id="pembayaran-btn" class="waves-effect waves-light btn yellow black-text">PEMBAYARAN</a></li>
          <li><a href="index.html" class="waves-effect waves-light btn red">KELUAR</a></li>
        </ul>
      </div>
    </nav>
    <!-- /Navbar -->

    <!-- Body -->
    <div class="container">
      <div class="row center-align">
        <h1 class="col l12">Rekapitulasi Penjualan</h1>
        <div class="col l2 offset-l5">
          <input type="date" class="datepicker white">
        </div>
      </div>
      <div class="row">
        <!-- Card Makanan -->
        <div class="col l6">
          <div class="card-panel black-text">
            <div class="row center-align">
              <h4>
                <i class="fa fa-cutlery" aria-hidden="true"></i>
                Makanan
              </h4>
            </div>
            <!-- Pesanan -->
            <div class="row">
              <div class="col l3">
                30
              </div>
              <div class="col l9">
                Chicken Gordon Bleu
              </div>
              <hr class="grey lighten-2">
              <div class="col l3">
                18
              </div>
              <div class="col l9">
                Steak Waroeng
              </div>
            </div>
          </div>
        </div>
        <!-- /Card Makanan -->
        <!-- Card Minuman -->
        <div class="col l6">
          <div class="card-panel black-text">
            <div class="row center-align">
              <h4>
                <i class="fa fa-coffee" aria-hidden="true"></i>
                Minuman
              </h4>
            </div>
            <!-- Pesanan -->
            <div class="row">
              <div class="col l3">
                6
              </div>
              <div class="col l9">
                Milkshake Strawberry
              </div>
              <hr class="grey lighten-2">
              <div class="col l3">
                12
              </div>
              <div class="col l9">
                Lemon Tea
              </div>
            </div>
          </div>
        </div>
        <!-- /Card Minuman -->
      </div>
    </div>
    <!-- /Body -->

    <!-- JavaScript -->
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>
    <script text="text/javascript" src="js/script.js"></script>
  </body>
</html>