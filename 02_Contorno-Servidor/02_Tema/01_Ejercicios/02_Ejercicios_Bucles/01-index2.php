<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2.2 - Ejemplo 1</title>
</head>
<body>
<?php
    //Dado un entero, n, calcular la suma de los n primeros n´umeros impares
    printf("<h1>Suma impares</h1><br/>");

    printf("Ingrese un numero<br/>");
    fscanf(STDIN, "%d",$n);

    $suma = 0;

    for ( $i = 1; $i<= 2* $n; $i += 2 ){
        printf("<p>sumando $suma + $i</p>"); 
        $suma += $i;
    }
    printf("----------------------<br/>");
    printf("La suma vale: $suma");


?>
</body>
</html>