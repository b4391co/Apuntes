/*  : Realizar el ejercicio de la práctica anterior utilizando funciones. Debes pedir 6
números por pantalla, almacenar en un array y realizar las siguientes funciones.
Para cada una de las funciones que aparecen a continuación debes utilizar una función
▪ Mostrar el array en el cuerpo de la página y en la consola: mostrar
▪ Ordenarlos y mostrarlos: orden
▪ Invertir su orden y mostrarlos: ordenInv
En estos dos casos debes utilizar la función mostrar, la cual se recibe como argumento en
la función orden y ordenInv
▪ Mostrar el número de elementos que tiene el array: tamanno
▪ Búsqueda de un valor introducido por el usuario que nos diga si lo encuentra y su índice:
posicion
▪ Sumar todos los números pares: sumarPar. Para realizar esta acción debes utilizar la funcion esPar la cual se envía como argumento */

function run(num) {
    let numeros = [];
    numeros = solicitarNumeros(numeros);
    console.time('tiempo:');
    document.write("<br><br>Mostrar: <br>");
    mostrar(numeros);
    document.write("<br><br>Orden: <br>" + orden(numeros.slice()));
    document.write("<br><br>Orden inverso:<br>" + ordenInv(numeros.slice()));
    document.write("<br><br>tamaño: <br>" + tamanho(numeros));
    document.write("<br><br>Sumar pares: <br>" +  + sumarPares(numeros,esPar));
    document.write("<br><br>busqueda por posicion: <br>" + posicion(numeros));
    console.timeEnd('tiempo:');
}

function solicitarNumeros(numeros) {
    for (let i = 0; i < 6; i++) {
        num = parseInt(prompt("Introduce un numero: ",0));
        while( isNaN(num) ){
            num = parseInt(prompt("Introduce un numero: válido ",0));
        }
        numeros.push(num);
    }
    return numeros;
}

function mostrar(num) {
    num.forEach(element => {
        document.write(element + " " );
        console.log(element);
    });
}

function orden(num) {
    num.sort();
    return num;
}

function ordenInv(num) {
    num.sort();
    num.reverse();
    return num;
}

function tamanho(num) {
    return num.length;
}

function posicion(num) {
    posicion = parseInt(prompt("Introduce una posicion para buscar(1-6): ",0));
    while( isNaN(posicion) || posicion < 0 || posicion > 6 ){
        posicion = parseInt(prompt("Introduce un numero: válido (1-6)",0));
    }
    return num[posicion-1];
}

function sumarPares(num,f) {
    let suma = 0;
    num.forEach(element => {
        if (esPar(element)){
            suma += element;
        }
    });
    return suma;
}

const esPar = function (num) {
    if (num % 2 == 0 ){
        return true;
    }
    };

run();

