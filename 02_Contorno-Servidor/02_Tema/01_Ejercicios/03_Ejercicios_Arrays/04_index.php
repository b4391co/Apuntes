<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2.3 - Ejemplo 4</title>
</head>

<body>

    <h1>Tema 2.3 - Ejemplo 4</h1>
    <h3>Tabla de multiplicar</h3>
    <?php
    // Funcones 
    function tablaMultiplicar($num)
    {
        for ($i = 0; $i <= 10; $i++) {
            $tabla["$num × $i"] = $i * $num;
        }
        foreach ($tabla as $clave => $valor) {
            printf("<h4>$clave = $valor</h4>");
        }
    }
    ?>

    <?php
    // Variables
    
    $num = 5;

    tablaMultiplicar($num);
    ?>
</body>

</html>