<?php
require_once 'headers.php';
// $my_class = new MiClase();
// $my_class -> foo();
// 
// echo "<p>cte publica:" . MiClase::MY_PLUBIC . " </p>";
// echo "<p>cte MY_PRIVATE:" . MiClase::MY_PRIVATE . " </p>";
// echo "<p>cte MY_PROTECTED:" . MiClase::MY_PROTECTED . " </p>";

$puntoA = new Point(0, 0);
$puntoA->mostrarCoord();

$puntoB = new Point(10, 10);
$puntoB->mostrarCoord();

$cuadrado = new Cuadrado("Cuadrao",2,$puntoA,)