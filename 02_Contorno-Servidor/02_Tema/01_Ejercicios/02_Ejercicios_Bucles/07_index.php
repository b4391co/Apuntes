<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tema 2.2 - Ejemplo 7</title>
</head>
<body>
    <h2>Ejemplo 9</h2>
    <?php
        //notas

    function valorNota(int $nota){
        printf("$nota<br/>");

        switch($nota){
            case $nota > 0 && $nota < 5:
                printf("Suspenso");
                break;
            case ($nota >= 5 && $nota < 6.99):
                printf("Aprobado");
                break;
            case ($nota >= 7 && $nota < 8.99):
                printf("Notable");
                break;
            case $nota >= 9 && $nota < 9.99;
                printf("sobresaliente");
                break;
            case $nota == 10;
                printf("matricula de honor");
                break;
            default:
                printf("nota no valida");
                break;
        }
        printf("<br/>----------------------<br/>");
    }

    valorNota(0);
    valorNota(4.99);
    valorNota(5);
    valorNota(5.99);
    valorNota(7.87);
    valorNota(8);
    valorNota(9);
    valorNota(10);

    ?>
</body>
</html>