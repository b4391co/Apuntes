import java.util.Scanner;

/* Pedir números indefinidamente. A medida que se piden números solo queremos
mostrar los que cumplan al menos uno de los siguientes requisitos:
• Requisito 1: Que sea par y que al multiplicarlo por 5 sea mayor que 25
• Requisito 2: Que sea impar y que al multiplicarlo por 3 sea menor que 10 */

public class _01_Ejercicio {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);


        while(true){
            System.out.println("Introduce Un numero");
            int numSolicitado = scan.nextInt();
            if (numSolicitado % 2 == 0 && numSolicitado*5 > 25){
                System.out.println("el numero: " + numSolicitado + " es par y > 25" );
            } else if (numSolicitado % 2 != 0 && numSolicitado*3 < 10 ){
                System.out.println("el numero: " + numSolicitado + " es impar y < 10" );
            }
        }
    }
}
