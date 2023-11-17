import java.util.Scanner;

public class _01_Ejercicio {
    /* Pedir 5 números, y mostrar al final si se ha introducido alguno negativo */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numerosIntroducidos = new int[5];
        int countNegativos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero");
            numerosIntroducidos[i] = scan.nextInt();
        }

        System.out.println("----------------------------------");

        for (int i : numerosIntroducidos) {
            if (i < 0) {
                System.out.print(i + ", ");
                countNegativos++;
            }
        }

        System.out.println("Total de negativos: " + countNegativos);

    }
}
