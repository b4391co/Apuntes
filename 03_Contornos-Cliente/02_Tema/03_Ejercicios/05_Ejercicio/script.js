/*  Realiza un script que halle la media de unos valores numéricos enteros introducidos 
por el usuario. Mostrar el resultado en una alerta. La introducción de datos se realizará 
de tal forma que si se pulsa el botón aceptar el usuario continuará introduciendo valores
y si se pulsa cancelar se muestra el resultado. Se debe comprobar que los valores 
introducidos son numéricos, si no es así se mostrará un mensaje y se seguirán pidiendo 
datos. También se controlará que se haya introducido al menos un valor numérico. */


function solicitarNumeros(numeros) {
    num = parseInt(prompt("Introduce un numero: "));
    numeros.push(num);
    return numeros;
}

function mediaNumeros(numeros) {
    suma = 0;
    numeros.forEach(element => {
        suma += element;
    });
    let media = suma / numeros.length;
    return media;
}

let numeros = [];

numeros = solicitarNumeros(numeros);
media = mediaNumeros(numeros);
console.log(mediaNumeros);
while(true){
    if(confirm("La media es: " + media + " \nOk para introducir otro numero")){
        numeros = solicitarNumeros(numeros);
        console.log(numeros);
        media = mediaNumeros(numeros);
        console.log("media: " + media);
    } 
}

