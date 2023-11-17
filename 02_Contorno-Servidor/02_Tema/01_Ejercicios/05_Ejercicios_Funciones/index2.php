<?php 
include "funciones.php";
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Funciones</title>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>Operaciones</h1>
    <form method="post">
        <label>Filas: </label>
        <input type="number" name="filas" id="id_filas" value="<?=$_POST["filas"];?>" required></input>
        <br><br>
        <label>Columnas: </label>
        <input type="number" name="columnas" id="id_columnas" value="<?=$_POST["columnas"];?>" required></input>
        <br><br>
        <input type="submit" value="Enviar" />
    </form>
    <br><br>
<?php 
    $filas = $_POST["filas"];
    $columnas = $_POST["columnas"];

    //crearTabla($columnas,$filas);
    $numeros = crearArray($filas,$columnas);
    crearTablaConArray($numeros);
?>
</body>
</html>

