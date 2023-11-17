import java.util.Scanner;

public class _06_Notas {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una nota: ");
		float nota = scan.nextInt();

		if ( nota > 0.00 && nota < 5 ){
			System.out.println("Suspenso");
		} 
		else if (nota >= 5 && nota < 7  ) {
			System.out.println("Bien");
		} 
		else if (nota >= 7 && nota < 9  ) {
			System.out.println("Notable");
		} 
		else if (nota >= 9 && nota < 10  ) {
			System.out.println("Sobresaliente");
		} 
		else if (nota == 10 ) {
			System.out.println("Matricula");
		} 
		else {
			System.out.println("Nota no valida");
		} 
	}

}
