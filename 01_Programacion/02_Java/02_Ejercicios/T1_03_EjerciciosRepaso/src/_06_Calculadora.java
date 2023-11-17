import java.util.Scanner;

public class _06_Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        double numResultado = sc.nextInt();

        String operacion = pedirOperacion("");


        double numOperar;
        while (!operacion.equalsIgnoreCase("AC")){
                numOperar = pedirNumero();

            switch (operacion) {
                case "+":
                    numResultado += numOperar;  
                    break;
                case "-":
                    numResultado -= numOperar;  
                    break;
                case "*":
                    numResultado *= numOperar;  
                    break;
                case "/":
                    numResultado /= numOperar;  
                    break;
                default:
                    break;
            }

            System.out.println(numResultado);

            operacion = pedirOperacion("C");

            if ( operacion.equalsIgnoreCase("C")){
                numResultado = pedirPrimerNumero();
                operacion = pedirOperacion("");
            }
        }
    }

    public static double pedirPrimerNumero(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        double num = sc.nextInt();
        
        return num;
    }

    public static double pedirNumero(){
        Scanner sc = new Scanner(System.in);

        System.out.println("siguiente numero");
        double num = sc.nextInt();
        
        return num;
    }

    public static String pedirOperacion(String reiniciar){
        Scanner sc = new Scanner(System.in);

        if (reiniciar.equalsIgnoreCase("C")){
            System.out.println("(+) sumar, (-) restar, (*) multipicar, (/) dividir, (C)reiniciar, (AC) EXIT");
        } else {
            System.out.println("(+) sumar, (-) restar, (*) multipicar, (/) dividir, (AC) EXIT");
        }
        String operacionSeleccionada = sc.next();
        
        return operacionSeleccionada;
    }
}