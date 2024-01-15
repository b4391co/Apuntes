<?php
if (isset($_COOKIE["visitas"])) {
    $visitas = $_COOKIE["visitas"];
    setcookie("visitas", ++$visitas, time() + 3600);
} else {
    setcookie("visitas", 1, time() + 3600);
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Visits counter</title>
</head>

<body>
    <h1>Visits counter</h1>

    <?php
    if (isset($visitas)) {
    ?>
        <p>Nos ha visitado <?= $visitas ?> veces</p>
    <?php
    } else {
    ?>
        <p>Bienvenido</p>
    <?php
    }
    ?>
</body>

</html>
