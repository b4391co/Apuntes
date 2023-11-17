<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2.2 - Ejemplo 6</title>
</head>
<body>
    <h2>Ejemplo 8</h2>
    <?php
    // Dado

    $count = 0;


    while($num != 5){
        $count++;
        $num = rand(1,6);
        printf("<img src='.assets/$num.png'> <br/>");
    }

    printf("<br/>se necesitaron $count tiradas para sacar el 5");

    ?>
</body>
</html>