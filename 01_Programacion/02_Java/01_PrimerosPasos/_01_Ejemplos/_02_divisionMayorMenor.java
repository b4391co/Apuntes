import java.util.Scanner;

public class _02_divisionMayorMenor {

    public static void division(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduza un numero");
        int num1 = scan.nextInt();
        System.out.println("Introduzca un segundo numero");
        int num2 = scan.nextInt();

        if ( num1 > num2 ) {
            int resultado = num1 / num2;
            System.out.println(num1 + "/" + num2 + " = " + resultado); 
        }else { 
            int resultado = num2 / num1;
            System.out.println(num1 + "/" + num2 + " = " + resultado);
        } 
    }

    public static void main(String args[]) {
        division();
    }
}
