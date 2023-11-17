/* Realizar una pequeña aplicación en JavaScript que al usuario adivinar un número de 0 a 50. El usuario dispone de 5 intentos.
• Generar un número aleatorio de 0 a 50. Mostrar el número generado por la consola para comprobar
que el programa funciona correctamente
• Mediante prompt se le solicita un número al usuario. Si Acierta finaliza la ejecución del programa
con un Alert en el que se le indica que “Enhorabuena”
• En caso contrario le indica al usuario si el número es mayor o menor.
• Si transcurridos los 5 intentos no encuentra el número muestra un Alert “Lo siento, no ha conseguido adivinar el número “  */

function randomNumber(max) {
    let numeroRandom = Math.floor(Math.random() * max ); 
    return numeroRandom;
}

function checkNumber(min, max) {
    let numeroIntroducido = parseInt(prompt("Introduce un número (de 0 a 50)",0));

    while( isNaN(numeroIntroducido) || numeroIntroducido < min || numeroIntroducido > max ){
        numeroIntroducido = parseInt(prompt("Error: Introduce un número valido (de 0 a 50) ",0));
    }
    return numeroIntroducido; 

}

function adivinarNumero(numeroRandom,MIN, MAX){
    let intentos;
    const MAXINTENTOS = 5;
    for ( intentos = MAXINTENTOS; intentos >= 1; intentos--) {
        
        numeroIntroducido = checkNumber(MIN, MAX)
        if (numeroIntroducido == numeroRandom) {
            alert("Enhorabuena, has adivinado el número en el intento: " + ( MAXINTENTOS + 1 - intentos ));
            break; 
        } else if (numeroIntroducido < numeroRandom) {
            alert("El número introducido es menor que el número aleatorio. \nIntentos restantes: " + (intentos - 1) );
        } else {
            alert("El número introducido es mayor que el número aleatorio. \nIntentos restantes: " + (intentos - 1) );
        }
    }
    
    if (intentos == 0) {
        alert("Lo siento, no has conseguido adivinar el número. El número correcto era " + numeroRandom);
    }
}

const MINNUMBER = 0;
const MAXNUMBER = 50;
let numeroRandom = randomNumber(MAXNUMBER);
console.log(numeroRandom);

adivinarNumero(numeroRandom,MINNUMBER,MAXNUMBER);


