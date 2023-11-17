/* Realiza un script que lea una secuencia de números introducidos por teclado y
calcula y visualiza su suma y media. La secuencia terminará cuando el número introducido
sea cero.
Modifica el ejercicio utilizando un array en el que tenga almacenados varios números, por
ejemplo: numeros=[1,2,5,7,6]  */

function solicitarNumeros() {
    num = parseInt(prompt("Introduce un numero (0 exit): "))
    while ( num != 0 ){
        numeros.push(num); 
        num = parseInt(prompt("Introduce un numero (0 exit): "))
    }
    return numeros;
}

function operaciones(numeros) {
    numeros.forEach(key => {
        suma += key;
    });
    
    document.write("<br/>la suma es: " + suma);
    document.write("<br/>la media es: " + suma/numeros.length);
}

let num = 1;
let suma = 0;
let contador = 0;
let numeros = [];

numeros = solicitarNumeros();

operaciones(numeros);


