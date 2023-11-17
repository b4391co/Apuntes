// Ejercicio 3 - Leer 3 numeros y mostrar el mayor

'use strict';

let num1 = parseInt(prompt('Introduze un primer numero'));
let num2 = parseInt(prompt('Introduce un segundo numero'));
let num3 = parseInt(prompt('Introduce un tercer numero'));

if ( num1 > num2 & num1 > num3 ) {
    document.write(`<b> num1 </b> con valor <b> ${num1} </b> es el mayor`);
} else if ( num2 > num1 & num2 > num3 ) {
    document.write(`<b> num2 </b> con valor <b> ${num2} </b> es el mayor`);
} else {
    document.write(`<b> num3 </b> con valor <b> ${num3} </b> es el mayor`);
}



