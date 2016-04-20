<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta name="description" content="Bandung Web Kit" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <title>Login | Waroeng Steak and Shake</title>

    <link rel="icon" type="image/png" href="img/logo-navbar.jpg" />
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css" />
    <link rel="stylesheet" href="css/style.css" />
  </head>
  <body>
    <div class="valign-wrapper full-height black">
      <div class="valign container">
        <div class="row center-align">
          <img class="responsive-img" src="img/logo.png" />
        </div>

        <!-- Form -->
        <div class="row">
          <form id="login" class="col l4 offset-l4">
            <div class="input-field">
              <i class="material-icons prefix">perm_identity</i>
              <input id="username" type="text" class="validate white-text" />
              <label for="username">Username</label>
            </div>
            <div class="input-field">
              <i class="material-icons prefix">vpn_key</i>
              <input id="password" type="password" class="validate white-text" />
              <label for="password">Password</label>
            </div>
            <div class="right-align">
              <a href="#" id="login-btn" class="btn waves-effect waves-light yellow black-text">LOGIN</a>
            </div>
          </form>
        </div>
        <!-- /Form -->

      </div>
    </div>

    <!-- JavaScript -->
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.min.js"></script>
    <script text="text/javascript" src="js/script.js"></script>
  </body>
</html>