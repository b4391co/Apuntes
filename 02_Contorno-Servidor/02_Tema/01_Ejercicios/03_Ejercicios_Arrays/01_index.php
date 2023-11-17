<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2.3 - Ejemplo 1</title>
</head>
<body>
<h1>Tema 2.3 - Ejemplo 1</h1>

<?php
// Funcones
function horasExtra($horas_extra_semana){

    for( $i = 0; $i < count($horas_extra_semana); $i++){
        $contador += $horas_extra_semana[$i] * PAGO_HORA_EXTRA;
    };

    return $contador ;
}
?>

<?php  
// Variables
const PAGO_HORA_EXTRA = 12.5;

$horas_extra_semana = [
    3.5 , 5 , 10 , 0 , 0 , 2 , 7
];

$contador = horasExtra($horas_extra_semana);
printf($contador);
?>
</body>
</html>