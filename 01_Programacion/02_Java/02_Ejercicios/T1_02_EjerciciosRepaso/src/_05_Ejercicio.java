import java.util.Scanner;

/* Se creará un número random del 56 al 108 e intentaremos adivinar cual es.
El programa tendrá que pedirte dos números.
• El primero, cuando se pida por teclado se multiplicará por el número random.
Solo está permitido números impares mayores de 50.
• Se mostrará el resultado de la multiplicación
• El segundo número será tu intento para adivinar el número random */

public class _05_Ejercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numRandom = (int)(Math.floor(Math.random() * (108-56+1)) + 56);
        System.out.println("------------------------------");
        System.out.println("Adivina el numero entre 56 - 108");

        System.out.println("Escribe un numero impar mayor de 50 para la pista");
        int numSolicitadoMultiplicar = scan.nextInt();

        while ( numSolicitadoMultiplicar < 50 || numSolicitadoMultiplicar % 2 == 0){
            System.out.println("------------------------------");
            System.out.println("Error");
            System.out.println("Escribe un numero impar mayor de 50 para la pista");
            numSolicitadoMultiplicar = scan.nextInt();
        } 

        System.out.println(numSolicitadoMultiplicar + " x ( numero Random ) = " + numSolicitadoMultiplicar*numRandom);
        
        System.out.println("------------------------------");

        for (int i = 3; i >= 0; i--) {
            System.out.println("------------------------------");
            System.out.println("Escribe un numero");
            int numSolicitado = scan.nextInt();

            if (numSolicitado == numRandom){
                System.out.println("has acertado el numero oculto");
                break;
            } else {
                System.out.println("Has fallado te quedan " + i + " intentos");
            }
        }
        System.out.println("El numero era: " + numRandom); 


    }
}