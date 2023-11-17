/* Realizar un script que muestre los números pares por la consola y los números
impares en la página.
Debes crear un array con varios números. Recorres dicho array, y compruebas si el número
es par o impar. Para hacer dicha comprobación debes utilizar una función EsPar(), 
que recibe un número y devuelve un valor booleano. */

function solicitarNumeros() {
    num = parseInt(prompt("Introduce un numero (0 exit): "))
    while ( num != 0 ){
        numeros.push(num); 
        num = parseInt(prompt("Introduce un numero (0 exit): "))
    }
    return numeros;
}

function EsPar(num){
    if (num % 2 == 0){
        return true;
    }
    return false;
}

function mostrarNumeros(num){
    if(EsPar(num)){
        console.log(num);
    } else{
        document.write("<br/>" + num);
    }
}

let numeros = [];

numeros = solicitarNumeros();

numeros.forEach(key => {
    mostrarNumeros(key);
});