<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2 - Ejemplo 3</title>
</head>
<body>
<?php
    //Ecuancion de segundo grado
    printf("<h1>Ecuaciones de segundo grado</h1><br/>");

    function ecunacionesSegundoGrado(int $A, int $B, int $C){
        $D = pow($B,2) - 4 * $A * $C;
        $AA = 2 * $A;
        printf("<br/><br/>A = $A, B = $B, C = $C<br/>");
        printf("D = B^2 - 4 * A * C <br/>");
        printf("$D = $B^2 - 4 * $A * $C <br/>");
        printf("--------------------------------<br/>");


        if ( $D >= 0 ) {
            $DD = sqrt($D);
            $x1 = (-$B + $DD ) / $AA;
            $x2 = (-$B - $DD ) / $AA;
            printf("La ecuación tiene dos raices: <b>$x1 y $x2</b>  <br/>");
            printf("--------------------------------<br/>");
        } else {
            $DD = sqrt(-$D);
            $Re = number_format(-$B / $AA,2);
            $Im = number_format($DD / $AA, 2);
            printf("La ecuacion tiene raices complejas conjugadas: <br/>");
            printf("Parte real <b>$Re</b> <br/>");
            printf("Parte imaginaria <b> $Im</b> <br/>");
            printf("--------------------------------<br/>");
        }
    }
    
    ecunacionesSegundoGrado(5,4,2);

    ecunacionesSegundoGrado(2,7,3);

?>
</body>
</html>