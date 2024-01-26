<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ejercicio 1</title>
    <style>
        #campo {
            flex-direction: column;
            justify-content: space-between;
            flex-wrap: wrap; 
            height: 500px;
            width: calc(100% - 20px);
            background-color:  rgb(148, 245, 245);;
        }
        #coche1 { 
            position:absolute;
            height: 80px;
            width: 120px;
            top: 10px;
            left: 10px;
        }

        #resultado {
            margin-top: 100px;
            font-size: 30px;
            text-align: center;
        }

        #coche2 {  
            position:absolute;
            height: 80px;
            width: 120px;
            top: 450px;
            left: 10px;
        }

        #meta {
            position: fixed;
            margin-left:1850px;
            height: 500px;
        }
        .ganador {
            font-size: 50px; /* Tamaño de la fuente */
            font-weight: bold; /* Negrita */
            color: #008000; /* Color verde (puedes cambiarlo según tus preferencias) */
            text-align: center; /* Alineación en el centro */
            text-transform: uppercase; /* Convertir el texto a mayúsculas */
            margin: 0; /* Eliminar márgenes predeterminados si los hay */
            padding: 10px; /* Añadir un poco de espacio alrededor del texto */
        }
        .perdedor {
            font-size: 50px; /* Tamaño de la fuente */
            font-weight: bold; /* Negrita */
            color: red; /* Color verde (puedes cambiarlo según tus preferencias) */
            text-align: center; /* Alineación en el centro */
            text-transform: uppercase; /* Convertir el texto a mayúsculas */
            margin: 0; /* Eliminar márgenes predeterminados si los hay */
            padding: 10px; /* Añadir un poco de espacio alrededor del texto */
        }
    </style>
</head>
<body>
    <div id="campo">
        <img id="meta" src="./assets/meta.jpg">
        <img id="coche1" name="1" value="coche 1" src="./assets/cocheNegro.png">
        <img id="coche2" name="2" value="coche 2" src="./assets/cocheAmarillo.png">
    </div>

    <div id="resultado"></div>
<script>
var eleccion = parseInt(prompt("selecciona un coche:"));

var posCoche1 = 0;
var posCoche2 = 0;
// meta 1600px
var resultado = document.createElement("div");

function ejecutarMovimiento() {
    if (posCoche1 <= window.innerWidth-150 && posCoche2 <= window.innerWidth-150) {
        posCoche1 += Math.floor(Math.random() * (5 + 1));
        posCoche2 += Math.floor(Math.random() * (5 + 1));
        document.getElementById("coche1").style.left = posCoche1 + "px";
        document.getElementById("coche2").style.left = posCoche2 + "px";
        setTimeout(function () { ejecutarMovimiento(); }, 6);
        if(posCoche1 >= window.innerWidth || posCoche2 >= window.innerWidth){
            if ((eleccion == 1 && (posCoche1 > posCoche2)) || (eleccion == 2 && (posCoche1 < posCoche2))){
                resultado.innerHTML = "GANADOR, el coche " + eleccion + " gano!";
                resultado.setAttribute("class","ganador");
            }
            else{
                resultado.innerHTML = "PERDEDOR, el coche " + eleccion + " no gano";
                resultado.setAttribute("class","perdedor");
            }
        }
    }
}
ejecutarMovimiento();


document.getElementById("resultado").append(resultado);
</script>
</body>
</html>