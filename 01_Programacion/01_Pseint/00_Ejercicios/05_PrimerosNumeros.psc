
Algoritmo parImpar
	Definir num1 Como Entero;
	Escribir "Ingrese el numero: ";
	Leer num1;
	Definir aux Como Entero;
	definir suma Como Entero;
	aux = 1;
	suma = 0;
	
	Mientras aux <= num1 Hacer
		suma = suma + aux;
		Escribir aux;
		aux = aux + 1;
	FinMientras
	
	Escribir suma;
FinAlgoritmo
