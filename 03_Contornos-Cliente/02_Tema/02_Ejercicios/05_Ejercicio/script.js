

function operaciones(num1, num2){
    let suma, resta, multiplicacion, division;

    suma=num1 + num2;
    resta=num1 - num2;
    multiplicacion=num1 * num2;
    division=num1 / num2;

    document.write("<p> Suma: "+ suma +"</p>");
    document.write("<p> Resta: "+ resta +"</p>");
    document.write("<p> Multiplicación: "+ multiplicacion +"</p>");
    document.write("<p> División: "+ division +"</p>");
}

num1 = parseInt(prompt("Ingrese el primer numero",1));
num2 = parseInt(prompt("Ingrese el segundo numero",1));


operaciones(num1,num2);