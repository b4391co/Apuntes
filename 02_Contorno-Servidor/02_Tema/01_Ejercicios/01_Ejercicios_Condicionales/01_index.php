<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2 - Ejemplo 1</title>
</head>
<body>
<?php
    // centimetros a pulgadas y pies
    const RATIO_PULGADAS_CM = 2.54;
    const RATIO_PULGADAS_PIES = 12;

    //cm
    $altura = 172;
    $pulgadas = number_format($altura / RATIO_PULGADAS_CM, 2);
    $pies = number_format($pulgadas / RATIO_PULGADAS_PIES, 2);
        
    printf("--------------------------------<br/>");
    printf("$altura cm a: <br/><br/>");
    printf("pugadas: <b> $pulgadas </b><br/>");
    printf("pies: <b> $pies </b><br/>");
    printf("--------------------------------<br/>");

?>
</body>
</html>