<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2.3 - Ejemplo 3</title>
</head>
<body>

<h1>Tema 2.3 - Ejemplo 3</h1>
<?php
// Funcones 
function contadorHasta0($num){
    if ( $num > 0 ){
        for ($i = 0; $i <= $num; $i++){
            $total[] = $i;
        }
    } else {
        for ($i = $num; $i <= 0; $i++){
            $total[] = $i;
        }
    }

    // Mostrar 
    for($i = 0; $i < count($total);$i++){
        printf("<p>$i</p>");
    }
}
?>

<?php  
// Variables

$num = 15;

contadorHasta0($num);
?>
</body>
</html>