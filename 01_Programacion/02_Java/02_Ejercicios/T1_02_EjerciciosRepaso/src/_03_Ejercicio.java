import java.util.Scanner;

/* Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de
28, 30 y 31 días. */

public class _03_Ejercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Día:");
        int dia = scan.nextInt();

        System.out.println("Mes:");
        int mes = scan.nextInt();

        System.out.println("Año:");
        int anho = scan.nextInt();
        
        if( mes <= 12 && mes != 2){
            if ( mes % 2 == 0 ){
                if ( dia > 0 && dia <= 30){
                    System.out.println("Existe");
                } else {
                    System.out.println("No existe");
                }
            } else {
                if ( dia > 0 && dia <= 31){
                    System.out.println("Existe");
                } else {
                    System.out.println("No existe");
                }
            }
        } else if ( mes == 2 ) {
            if ( anho % 4 == 0 && dia > 0 && dia <= 28) {
            System.out.println("Existe, es bisiesto");
            } else if ( anho % 4 != 0  && dia > 0 && dia <= 29){
            System.out.println("Existe, pero no es bisiesto");
            }
        } else {
            System.out.println("No existe");
        }

    }


}