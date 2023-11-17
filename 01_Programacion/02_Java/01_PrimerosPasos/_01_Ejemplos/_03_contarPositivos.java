import java.util.Scanner;

public class _03_contarPositivos {

	public static void dividirMayorMenor() {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		int num;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			if (num > 0) 
				total++;
		}
		System.out.println("se ha introducido" + total + " números positivos");
	}

	public static void main(String args[]) {
        dividirMayorMenor();
    }
	
}
