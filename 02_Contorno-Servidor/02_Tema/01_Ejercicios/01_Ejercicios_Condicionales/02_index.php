<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2 - Ejemplo 2</title>
</head>
<body>
<?php
    //algoritmo para elevar un numero  

    $x = 5;
    $f = 0;

    if ( $x > 0 ) {
        $f = pow($x,2);
    }

    printf("--------------------------------<br/>");
    printf("x = <b>$x</b> <br/><br/>");
    printf("f(x) = x² <br/>");
    printf("f($x) = <b>$f</b> <br/>");
    printf("--------------------------------<br/>");


?>
</body>
</html>