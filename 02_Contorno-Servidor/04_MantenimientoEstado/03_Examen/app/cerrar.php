<?php

session_start();
require_once "util.php";

unset($_SESSION['nombre']);
unset($_SESSION['cesta']);
header('Location:login.php');

cerrarSesion();