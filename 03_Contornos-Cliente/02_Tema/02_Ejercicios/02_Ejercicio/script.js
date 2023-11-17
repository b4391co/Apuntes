// Ejercicio 2 - Tabla de multiplicar de un numero introducido por teclado

'use strict';

let i = 1;
let num1 = parseInt(prompt('Introduze un numero'));

document.write(`tabla del multiplicar de <b> ${num1} </b><br>`);
if (num1 > 0) {
    for (i; i <= 10; i++) {
        document.write(`${num1} x ${i} = ` + num1 * i + '<br>');
    }
}


