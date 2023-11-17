'use strict';

let num1 = parseInt(prompt('Introduze un numero'));
num1 = Math.floor(num1);

let length = Math.ceil(Math.log10(num1 + 1));

if ( num1 >= 0 ){
    document.write("------------------------------------------- </br>");
    document.write(`NUMERO INTRODUCIDOO: <b> ${num1} </b> </br>`); 
    document.write(`tiene <b> ${length} </b> caracteres </br>`); 
    document.write("-------------------------------------------");
} else {
    document.write("</br> NO SE PERMITEN NUMEROS NEGATIVOS!");
}