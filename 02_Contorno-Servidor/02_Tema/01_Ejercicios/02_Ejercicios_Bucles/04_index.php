<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2.2 - Ejemplo 4</title>
</head>
<body>
<?php
    // Modifica el anterior script para que el bucle haga lo mismo, 
    // pero se detenga si alcanza un valor mínimo >= 2
    $VALOR_MIN = 2;
    $n = 7;
    $suma = 1;
    $ter = 1;
    $k = 0; 

    while($suma < $VALOR_MIN) {
        $ter = $ter / 2;

        printf("<p>sumando $suma + $ter</p>");
        $suma += $ter;
    }

    printf("<p>La suma vale $suma</p>");

?>
</body>
</html>