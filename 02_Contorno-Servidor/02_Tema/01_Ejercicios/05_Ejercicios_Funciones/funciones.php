<?php
// Ejercicio 2
const RANDOM_MINIMO = 0;
const RANDOM_MAXIMO = 10;
function operar(float $valor1, float $valor2, int $op){
    switch ($op) {
        case SUMA:
            $resultado = $valor1 + $valor2;
            break;
        case PRODUCTO:
            $resultado = $valor1 * $valor2;
            break;
        default:
            break;
    }
    return $resultado;
}


function crearTabla($valores){
    $x = count($valores);
    $y = count($valores[0]);
    printf("<table>");
    printf("<thead><tr>");
    for ($i=1; $i <= $y; $i++) { 
        printf("<th> Col". $i ."</th>");
    }
    printf("</tr></thead><tbody>");
    for ($i=0; $i < $x ; $i++) { 
        printf("<tr>");
        for ($j=0; $j < $y; $j++) { 
            printf("<td>". $valores[$i][$j] ."</td>");
        }
        printf("</tr>");
    }
    printf("</tbody></table>");
}


function crearArray(int $x,int $y){
    for ($i=0; $i < $x ; $i++) {
        for ($j=0; $j < $y; $j++) {
            $numeros[$i][$j] = rand(RANDOM_MINIMO,RANDOM_MAXIMO);
        }
    }
    return $numeros;
}

function crearTablaConArray($valores){
    crearTabla($valores);
}

// Ejercicio 3

function valorToArray(String $datos, String $SEPARADOR, int $MINIMO, int $MAXIMO ){
    $dato = $SEPARADOR == SEPARADOR_CALIFICACION ? "la calificacion" : "el peso";
    $Array = explode($SEPARADOR, $datos);
    foreach ($Array as $key => $value) {
        $suma += $value;
        if (!is_numeric($value)){
            printf("<br>ERROR: " . $dato ." debe de ser un numero");
            return false;
        }
        if (!($value >= $MINIMO && $value <= $MAXIMO)){
            printf("<br>ERROR: " . $dato ." debe de ser entre 0 y " . $MAXIMO);
            return false;
        }
        if ($value == " "){
            printf("<br>ERROR: " . $dato ." no puede estar vacio");
            return false;
        }
    }
    if ( $suma != $MAXIMO && $SEPARADOR == SEPARADOR_PESOS ){
        printf("<br>ERROR: la suma de los pesos debe ser 100, actualmente es: " . $suma );
        return false;
    }
    return $Array;
}

function calcularMedia(array $calificaciones, array $pesos){
    if (count($calificaciones) != count($pesos)){
        printf("<br>ERROR: total de notas diferente al total de pesos");
        return false;
    }
    for ($i=0; $i < count($calificaciones); $i++) { 
        $nota += ($calificaciones[$i] * ($pesos[$i]/100));
    }
    if ($nota > CALIFICACION_MAXIMA){
        return CALIFICACION_MAXIMA;
    }
    return $nota;
}

function modificarCalificacion(array &$calificaciones){ // Ejercicio 4
    foreach ($calificaciones as $key => &$value) {
        $value += $value * PLUS;
    }
    unset($value);
}

const SEPARADOR_CALIFICACION = "/";
const SEPARADOR_PESOS = "%";
const CALIFICACION_MINIMO = 0;
const CALIFICACION_MAXIMA = 10;
const PESO_MINIMO = 0;
const PESO_MAXIMO = 100;
const PLUS = 0.10;

function media(){ // Ejecución
    $calificaciones = $_POST["calificaciones"];
    $pesos = $_POST["pesos"];

    $calificacionesArray = valorToArray($calificaciones,SEPARADOR_CALIFICACION,CALIFICACION_MINIMO,CALIFICACION_MAXIMA);
    modificarCalificacion($calificacionesArray);
    $pesosArray = valorToArray($pesos,SEPARADOR_PESOS,PESO_MINIMO,PESO_MAXIMO);

    $media = calcularMedia($calificacionesArray,$pesosArray);
    echo "<br>";
    printf("La media ponderada es: $media");
}