import java.util.Scanner;

public class _04_TablasDeMultiplicar {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int num = scan.nextInt();
		System.out.println("La tabla del " + num);

		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}

}
