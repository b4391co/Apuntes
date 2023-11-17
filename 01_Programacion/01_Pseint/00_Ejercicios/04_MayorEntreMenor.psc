//Escribir un Pseudocódigo que reciba un número 
// y compruebe si es par o impar
Algoritmo parImpar
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Escribir "Ingrese el numero: ";
	Leer num1;
	Escribir "Ingrese otro numero: ";
	Leer num2;

	si num1 > num2 Entonces
		Imprimir num1 " / " num2 " = " num1/num2;
	SiNo
		Imprimir num2 " / " num1 " = " num2/num1;
	FinSi
	
FinAlgoritmo
