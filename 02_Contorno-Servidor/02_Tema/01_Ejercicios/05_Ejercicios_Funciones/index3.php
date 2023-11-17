<?php 
include "funciones.php";
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calificacion Final</title>
    <style>
        table, th, td {

            border: 1px solid black;
            border-collapse: collapse;
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>Calculo de calificación final</h1>
    <form method="post">
        <label>Calificaciones separadas por "/" (p.e. 5/4.5 ) : </label>
        <input type="text" name="calificaciones" id="id_calificaciones" value="<?=$_POST["calificaciones"];?>" required></input>
        <br><br>
        <label>Pesos separados por "%" (p.e. 50%50): </label>
        <input type="text" name="pesos" id="id_pesos" value="<?=$_POST["pesos"];?>" required></input>
        <br><br>
        <input type="submit" value="Enviar" />
    </form>
    <br><br>
<?php 
    media();
?>
</body>
</html>