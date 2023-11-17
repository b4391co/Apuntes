<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formularios 1</title>
</head>

<body>
    <h1>Tienda de moda</h1>
    <form method="post" name="formulario-post">
        <label for="prenda[]">Seleccione una prenda: </label>
        <select name="prenda[]" id="prenda" required="required" multiple>
            <option value="">--Selecciona una opción--</option>
            <option value="abrigo">Abrigo</option>
            <option value="top">Top</option>
            <option value="camiseta">Camiseta</option>
        </select>
        <br/>

        <label for="color">Seleccione un color: </label>
        <input type="color" name="color" id="color" required="required">
        <br/>

        <input type="submit" value="Enviar">
    </form>

    <h2>Estos son los datos introducidos</h2>

    <?php
        foreach ($_POST as $clave => $valor) {
            echo "<strong>$clave</strong>:";
            if (!is_array($valor)) {
        
                echo "<span style='background-color:$valor;'> $valor</span>";
            } else {
                foreach ($valor as $clave2 => $valor2) {
                    echo " $valor2";
                }
            }
            echo "<br/>";
        }
    ?>
</body>

</html>