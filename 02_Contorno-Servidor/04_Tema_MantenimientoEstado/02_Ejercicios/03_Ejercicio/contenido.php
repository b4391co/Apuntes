<?php 
ob_start();
iniciarSesion();
?>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Contenido</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body>
        <div class="container-fluid">
            <h1>Contenido de la sesion</h1>
            <div class="row justify-content-center">
<?php
if (isset($_POST["Limpiar"])){
    cerrarSesion();
    header("Location: contenido.php");
    exit;
}
if(isset($_POST["text"]) && isset($_POST["Enviar"])){
    $texto = $_POST["text"];
    if (!(isset($_SESSION["textos"])))
        $_SESSION["textos"] = array(); 
}

if (isset($_SESSION["textos"])) 
    array_push($_SESSION["textos"], $texto);

if (isset($_SESSION["textos"])) {
    for ($i = 0; $i < count($_SESSION["textos"]); $i++) 
        echo "<li>" . $_SESSION["textos"][$i] . "</li>";
}
?>
                <div class="col-sm-12 col-md-6">
                    <form method="post">
                        <!-- Email input -->
                        <div class="form-group mb-4 ">
                            <label class="form-label" for="email">texto</label>
                            <input type="text" id="text" class="form-control" name="text"/>
                        </div>
                        <!-- Submit button -->
                        <button class="btn btn-primary btn-block mb-4" name="Enviar">Enviar</button>
                        <button class="btn btn-danger btn-block mb-4" name="Limpiar">Limpiar</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
<?php  

function iniciarSesion(): bool {
    return (session_status() !== PHP_SESSION_ACTIVE)?  session_start(): false;
}
function cerrarSesion() {
    iniciarSesion();   
    if (ini_get("session.use_cookies")) {
        $params = session_get_cookie_params();
        setcookie(session_name(), '', time() - 42000,
                $params["path"], $params["domain"],
                $params["secure"], $params["httponly"]
        );
    }
    session_destroy();
}

ob_end_flush();
?>