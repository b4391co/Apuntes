<?php

ini_set("display_errors", "2");
ini_set("error_reporting", E_ALL & ~E_DEPRECATED & ~E_STRICT & ~E_WARNING);

const CERO = 0;
$a=22;

$b= $a + "1.3€";
echo "\$b es : $b <br/>";


$GLOBALS["b"]=4;
echo 'Valor de \$GLOBALS["b"] es '. $GLOBALS["b"];

$c=$b/CERO;




