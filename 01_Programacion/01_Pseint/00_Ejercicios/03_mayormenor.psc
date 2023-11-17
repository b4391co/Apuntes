//Escribir un Pseudocódigo que reciba un número 
// y compruebe si es par o impar
Algoritmo parImpar
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir num3 Como Entero;
	Escribir "Ingrese el numero: ";
	Leer num1;
	Escribir "Ingrese otro numero: ";
	Leer num2;
	Escribir "Ingrese otro numero: ";
	Leer num3;
	

	si num1 > num2 Entonces
		si num1 > num3 Entonces
			si num3 > num2 Entonces
				Escribir num1 " > " num3 " > " num2;
			SiNo
				escribir num1 " > " num2 " > " num3;
			FinSi
		SiNo
			Escribir num3 " > " num1 " > " num2;
		FinSi
	SiNo
		si num2 > num3 Entonces
			Escribir num2 " > " num3 " > " num1;
		SiNo
			Escribir num3 " > " num2 " > " num1;
		FinSi
	FinSi
	
FinAlgoritmo
