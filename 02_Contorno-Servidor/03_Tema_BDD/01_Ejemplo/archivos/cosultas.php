<?php
require_once "MyPDO.php";

$mbd = new MyPDO();

$pdostmt = $mbd->query('SELECT * from books');
while (($row = $pdostmt->fetch(PDO::FETCH_OBJ)) !== false) {
    echo "<pre>";
    print_r($row);
    echo"</pre>";
}