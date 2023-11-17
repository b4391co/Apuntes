import java.util.Scanner;

public class _05_MediaYsuma {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		int num = scan.nextInt();

		int count = 0;
		int suma = 0;
		while ( num != 0 ){
			count ++;
			suma += num;
			
			System.out.println("introduce un numero (0 = exit): ");
			num = scan.nextInt();
		}

			
		
		System.out.println("----------------------");
		System.out.println( "La suma es " + suma);
		System.out.println( "La media es " + suma / count);
		System.out.println("----------------------");

	}

}
