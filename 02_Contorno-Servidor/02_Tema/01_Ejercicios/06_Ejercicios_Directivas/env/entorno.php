<?php

echo var_dump($PATH);

foreach($_ENV as $clave => $valor){
    $i++;
    echo "$i $clave => $valor<br/>";

}