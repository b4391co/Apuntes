Algoritmo PedirNumeroHasta0
	Definir num1 Como Entero;
	Definir suma Como Entero;
	Definir count Como Entero;
	
	suma = 0;
	count = 0;
	
	Escribir "introduce un numero: ";
	Leer num1
	
	
	Mientras ( num1 <> 0 ) Hacer
		count = count + 1;
		suma = suma + num1;
		
		Escribir "introduce un numero (0 = exit): ";
		Leer num1
	FinMientras
	
	Escribir"----------------------";
	Escribir "La suma es " suma;
	Escribir "La media es " suma / count;
	Escribir"----------------------";
	
FinAlgoritmo
