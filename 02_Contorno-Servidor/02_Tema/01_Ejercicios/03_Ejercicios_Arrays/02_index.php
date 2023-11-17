<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2.3 - Ejemplo 2</title>
</head>
<body>

<h1>Tema 2.3 - Ejemplo 2</h1>
<?php
// Funcones
function mediaIBEX($topIBEXpercent){
    foreach($topIBEXpercent as $clave => $valor){
        $media += $valor;
        printf("$clave &nbsp;&nbsp;&nbsp; --> $valor <br/>");
    }

    $media = $media / count($topIBEXpercent);
    printf(" la media es: <b>$media </b> ");
}
?>

<?php  
// Variables

$topIBEXpercent = [
    "IAG" => 3.4,
    "IBERDROLA" => 1.07,
    "ENDESA" => 0.46,
    "ENAGAS" => 0.26,
    "SOLARIA" => 0.26
];

mediaIBEX($topIBEXpercent);
?>
</body>
</html>