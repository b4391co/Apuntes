<?php

$phpFileUploadErrors = array(
    0 => 'There is no error, the file uploaded with success',
    1 => 'The uploaded file exceeds the upload_max_filesize directive in php.ini',
    2 => 'The uploaded file exceeds the MAX_FILE_SIZE directive that was specified in the HTML form',
    3 => 'The uploaded file was only partially uploaded',
    4 => 'No file was uploaded',
    6 => 'Missing a temporary folder',
    7 => 'Failed to write file to disk.',
    8 => 'A PHP extension stopped the file upload.',
);

function mostrarFicheros($ficheros){
    $keys = array_keys($ficheros);
    foreach ($ficheros[$keys[0]] as $clave => $valor) {
        echo "<br/><br/><b>Archivo " . ($clave + 1) . ":</b>";
        foreach ($keys as $key) {
            echo "<br/><strong>$key</strong>: " . $ficheros[$key][$clave];
            if ($key == "error"){
                
            }
        }
    }
}

function moverFicheros($ficheros,$errores){
    for ($i=0; $i < count($ficheros["error"]); $i++) { 
        if ($ficheros["error"][$i] == 0 && is_uploaded_file($ficheros["tmp_name"][$i])){
            $temp = $ficheros["tmp_name"][$i];
            $nombre = $ficheros["name"][$i];
            move_uploaded_file($temp, DESTINO . $nombre);
            echo "<br/><br/>Archivo <b>" . $nombre . "</b> Guardado con éxito.";
        }
        else {
            $error =  $ficheros["error"][$i];
            echo "<br/><br/><b>ERROR</b> al subir los ficheros:<b> " . $ficheros["name"][$i] . "</b>";
            echo "<br/>error " . $error . " : " . $errores[$error] ;
        }
    }
}
