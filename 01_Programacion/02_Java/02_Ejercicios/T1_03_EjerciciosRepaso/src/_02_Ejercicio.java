import java.util.Scanner;

/* Modifica el programa anterior para que solo se impriman por pantalla los
números impares. */

public class _02_Ejercicio {
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
            if( i % 2 != 0) {
                System.out.println(i);
            }
        System.out.println("-------------------------");
        }
    }
}