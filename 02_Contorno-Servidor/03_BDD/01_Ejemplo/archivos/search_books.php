<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Búsqueda</title>
</head>

<body>
    <h1>Búsqueda de libros</h1>

    <form method="GET">
        <label for="busqueda">Introduzca los términos de búsqueda: </label>
        <input type="search" name="busqueda" id="busqueda" required>
        <button type="submit">Buscar</button>
    </form>
</body>

</html>
<?php
if (isset($_GET["busqueda"])) {
    $terminos_busqueda = $_GET["busqueda"];
    if (trim($terminos_busqueda) !== "") {

        require_once "MyPDO.php";

        try {
            $con = new MyPDO();

            //En la bd bookdb no importan mayúsculas/minúsculas porque está usando collation caseinsensitive, 
            //pero no está demás que nuestro código no dependa de la collation de la base de datos

            $stmtLibros = $con->prepare("SELECT title as resultado
            FROM books 
            WHERE UPPER(title) 
            like :nombre
            UNION ALL 
            SELECT TRIM(CONCAT(COALESCE(first_name, '') , COALESCE(middle_name , ' '), COALESCE(last_name, '')))
            FROM authors 
            WHERE UPPER(first_name) 
            LIKE :nombre");
            $filtro = "%" . strtoupper($terminos_busqueda) . "%";
            $stmtLibros->bindParam("nombre", $filtro);
            $stmtLibros->execute();

            echo "<ol>";
            $resultado = $stmtLibros->fetch(PDO::FETCH_ASSOC);
            while ( $resultado == true ){
                echo "<li> $resultado[resultado] </li>";
                $resultado = $stmtLibros->fetch(PDO::FETCH_ASSOC);
            }
            echo "</ol>";
        } catch (Exception $e) {
            echo "<p>Ha ocurrido una excepción: " . $e->getMessage() . "</p>";
        }
        //Cerramos los recursos
        $con = null;
        $stmtLibros = null;

        
    } else {
        echo "<p> Introduzca una cadena no vacía </p>";
    }
}

?>