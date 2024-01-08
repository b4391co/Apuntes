<?php
$pwd = "Abc123.";
$hash = password_hash($pwd, PASSWORD_DEFAULT);
echo "el hash es : \n $hash";
$exito = password_verify($pwd, $hash);
var_dump($exito);