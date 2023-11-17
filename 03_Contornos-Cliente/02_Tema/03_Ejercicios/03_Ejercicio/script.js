/* Realiza un script que lea un número y calcule y visualice su factorial */
let num = parseInt(prompt("Introduce un numero"));
let factorial = 1; 



for (let i = 1; i <= num; i++) {
    factorial *= i;
}

document.write("El factorial es: " + factorial);