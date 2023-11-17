import java.util.Scanner;

/* Se pedirán 2 números por teclado. Se pedirá que se imprima por pantalla todos
aquellos números que estén entre ambos. Esto se repetirá indefinidamente
hasta que los 2 números sean iguales, que en ese caso el programa finalizará. */

public class _01_Ejercicio {
    public static void main(String[] args) {

        int num1 = solicitarNum();
        int num2 = solicitarNum();

        while ( num1 != num2 ){
            if(num1 < num2){
                recorrerNumeros(num1, num2);
            } else if ( num1 > num2 ){
                recorrerNumeros(num2, num1);
            }
            num1 = solicitarNum();
            num2 = solicitarNum();
        }
    }

    public static int solicitarNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce un numero");
        int num = scan.nextInt();
        return num;
    }

    public static void recorrerNumeros(int menor, int mayor){
        System.out.println("-------------------------");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
    }
}