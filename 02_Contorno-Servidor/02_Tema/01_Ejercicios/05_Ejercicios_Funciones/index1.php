<?php 
include "funciones.php";

const SUMA = 1;
const PRODUCTO = 2;
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Funciones</title>
</head>
<body>
    <h1>Operaciones</h1>
    <form method="post">
        <p>Seleccione una operación:
        <select name="operacion" id="id_operacion">
            <option value="1" <?php if($_POST["operacion"] == SUMA) echo "selected" ?>>suma</option>
            <option value="2" <?php if($_POST["operacion"] == PRODUCTO) echo "selected" ?>>producto</option>
        </select>
        </p>
        <label>operando 1: </label>
        <input type="number" name="valor1" id="id_valor1" step="0.01" value="<?=$_POST["valor1"];?>" required></input>
        <br><br>
        <label>operando 2: </label>
        <input type="number" name="valor2" id="id_valor2" step="0.01" value="<?=$_POST["valor2"];?>" required></input>
        <br><br>
        <input type="submit" value="Enviar" />
    </form>
    <br><br>
<?php 
    $operacion = $_POST["operacion"];
    $numIntroducido1 = $_POST["valor1"];
    $numIntroducido2 = $_POST["valor2"];

    $resultado = operar($numIntroducido1,$numIntroducido2,$operacion);

    printf("El resultado es: <b>" . $resultado . "</b>");
?>
</body>
</html>