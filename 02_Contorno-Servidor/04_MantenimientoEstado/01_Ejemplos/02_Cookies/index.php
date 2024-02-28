<?php
if (isset($_COOKIE["visitas"])) {

    if(isset($_POST["btn-eliminar"])){
        setcookie("visitas", '', time() + 3600);
        unset($_COOKIE['visitas']);
    } else {

    $visitas = $_COOKIE["visitas"];
    setcookie("visitas", ++$visitas, time() + 3600);
    }
} else {
    setcookie("visitas", 0, time() + 3600);
}

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Visits counter</title>
</head>

<body>
    <h1>Visits counter</h1>

    <form method="post">
        <button  type="submit" class="btn btn-danger" name="btn-eliminar">Eliminar</button>
    </form>
    <?php
    if (!isset($visitas) || $_COOKIE['visitas'] < 1) {
    ?>
        <p>Bienvenido</p>
    <?php
    } else {
    ?>
        <p>Nos ha visitado <?= $visitas ?> veces</p>
    <?php
    }
    ?>
</body>

</html>
