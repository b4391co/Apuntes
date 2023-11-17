import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numeroAleatorio = (int)(Math.random()*100);

        System.out.println("Escribe un numero");
        int numIntroducido = scan.nextInt();

        int intentos = 10;
        while (numeroAleatorio != numIntroducido && intentos > 1) {
            intentos --;
            if (numeroAleatorio > numIntroducido) {
                System.out.println("prueba con algo mas alto, intentos restantes: " + intentos);
            } else {
                System.out.println("Prueba con algo mas bajo, intentos restantes: " + intentos);
            }
            System.out.println("Escribe un numero");
            numIntroducido = scan.nextInt();
        }

        if( numIntroducido == numeroAleatorio ) {
            System.out.println("Has acertado, el numero era: " + numeroAleatorio + " Has adivinado en " + (10 - intentos) + " intentos");
        } else if ( intentos == 0){
            System.out.println("Has quedado sin intentos y no has acertado, el numero era: " + numeroAleatorio);
        }
    }
}