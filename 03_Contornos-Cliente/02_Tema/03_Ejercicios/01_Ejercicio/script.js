/* Realiza un script al que se le introduce un número e indique si dicho número es
primo. En ese caso mostrará una lista con todos los números primos menores que dicho número */


let num = parseInt(prompt("Introduce un numero"));
let primos = [];

if(esPrimo(num)){
    document.write(num + " Es primo");

    document.write("<br/>-------------------");
    for (let i = 2; i < num; i++) {
        if(esPrimo(i)){
            primos.push(i);
        }
    }
    document.write("<br/>" + primos);
} else{
    document.write(num + " no es primo");
}


function esPrimo(num) {
    for (let i = 2; i < num; i++) {
        if( num % i == 0){
            return false;
            break;
        }
    }
}