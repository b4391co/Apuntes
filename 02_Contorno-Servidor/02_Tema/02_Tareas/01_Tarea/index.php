<?php 
include "funciones.php";

ini_set("upload_max_filesize", "2M");

const DESTINO = "./assets/";
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Subidas</title>
</head>
<body>
    <h1>Subir archivos</h1>
    <form method="post" enctype="multipart/form-data">
        <label>Subir imagen(es): </label>
        <input type="file" name="ficheros[]" id="ficheros" multiple accept="image/jpg" required></input>
        <br><br>
        <input type="submit" value="Enviar" />
    </form>
    <br><br>
<?php   

if (isset($_FILES["ficheros"])){
    $ficheros = $_FILES["ficheros"];
    mostrarFicheros($ficheros);
    echo "<br/><br/>--------------------------";
    moverFicheros($ficheros, $phpFileUploadErrors);

}


?>
</body>
</html>