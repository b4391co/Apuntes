<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formularios 2</title>
</head>

<body>
    <h1>Reserva launch</h1>
    <form method="post" name="formulario-post">
        <label for="fecha">Introduzca una fecha: </label>
        <input type="date" id="fecha-id" name="fecha" value="2023-10-09" min="2023-10-09" max="2023-11-09" />
        <br/>

        <label for="hora">Seleccione a hora: </label>
        <input type="time" id="hora-id" name="hora" min="13:00" max="15:00" required />
        <br/>

        <fieldset>
            <legend>ubicación:</legend>

            <div>
                <input type="radio" id="terraza-id" name="ubicacion" value="terraza" checked />
                <label for="terraza">terraza</label>
            </div>

            <div>
                <input type="radio" id="interior-id" name="ubicacion" value="interior" />
                <label for="interior">interior</label>
            </div>
        </fieldset>
        <br/>

        <label for="alergias[]">indique las alergias: </label>
        <select name="alergias[]" id="alergias-id" multiple>
            <option value="">--Selecciona una opción--</option>
            <option value="huevo">Huevo</option>
            <option value="leche">leche</option>
            <option value="gluten">Gluten</option>
        </select>
        <br/>

        <input type="submit" value="Reservar">
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