<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2.2 - Ejemplo 2</title>
</head>
<body>
<?php
    $n = 5;
    $suma = 1;
    $ter = 1;

// FOR
    printf("<h2>FOR</h2>");

    for ($k = 1; $k <= $n; $k++){
        $ter = $ter / 2;
        printf("<p>sumando $suma + $ter</p>");
        $suma += $ter;
    }

    printf("<p>La suma vale $suma</p>");

    printf("-----------------------<br/>");
// WHILE 

    printf("<h2>WHILE</h2>");
    $n = 5;
    $suma = 1;
    $ter = 1;
    $k = 1; 

    while($k++ <= $n){
        $ter = $ter / 2;
        printf("<p>sumando $suma + $ter</p>");
        $suma += $ter;
    }

    printf("<p>La suma vale $suma</p>");

?>
</body>
</html>