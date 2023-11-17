<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2.2 - Ejemplo 5</title>
</head>
<body>
    <h2>Ejemplo 7</h2>
    <?php
    //Dado un nuumero natural, n, imprimir la lista de sus divisores, en orden decreciente
    
    $n = 20; 
    printf("Lista de divisores del numero: $n <br/>");
    for($i = $n/2; $i >= 2; $i-- ){
        if( $n%$i == 0){
            printf("$i<br/>");
        } 
    }
    ?>
</body>
</html>