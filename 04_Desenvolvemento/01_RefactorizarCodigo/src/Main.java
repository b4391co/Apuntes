import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int requestedNum = askForNum();
        int negativeCount = 0;

        while (requestedNum != -999) {
            if (requestedNum >= 0) {
                System.out.println("El número es positivo");
            } else {
                System.out.println("El número es negativo");
                negativeCount++;
            }
            requestedNum = askForNum();
        }

        System.out.println("El total de numeros negativos introducidos es " + negativeCount);
        System.out.println("---FIN DEL PROGRAMA---");
    }

    private static int askForNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero (-999 exit): ");
        while (!sc.hasNextInt()) { // Comprobamos que el valor introducido es un int
            System.out.println("Por favor, introduce un numero valido.");
            sc.next();
        }
        return sc.nextInt();
    }
}