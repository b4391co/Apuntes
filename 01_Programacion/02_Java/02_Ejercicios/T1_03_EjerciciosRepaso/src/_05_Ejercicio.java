import java.util.Scanner;

/* Una empresa necesita una aplicación para validar DNI. El programa deberá de
pedir DNIs en la clase main hasta que escribamos un 0 para salir. Debemos
hacer otra clase que se llame ValidadorDni que llamando a una función de su
clase “validar()” nos devuelva un Boolean. Los DNI cumplan el patrón descrito
por la administración
a. Longitud de 9 caracteres.
b. Los caracteres de 1 al 8 deben de ser números, el noveno será letra.
c. No son válidos los siguientes DNI: 00000000T, 00000001R, 99999999R.
d. La letra se calcula dividiendo los 8 dígitos entre 23. El resultado del resto
de esa división determina la letra según la siguiente tabla. */

public class _05_Ejercicio {
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        String dni = solicitarDni();
        System.out.println("----------------------------------");
        ValidadorDni(dni);
        System.out.println("----------------------------------");
    }


    public static String solicitarDni(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu dni: ");
        String dni = sc.nextLine();
        boolean valido = false;
        
        while (!valido){
            if  (dni.length() != 9 ){
                System.out.println("ERROR, el DNI debe tener 8 numeros y una letra ");
                System.out.println("Introduce tu dni: ");
                dni = sc.nextLine();
            } else if(!dni.substring(8).matches("[A-Z]*")){
                System.out.println("ERROR, el DNI debe tener una letra al final ");
                System.out.println("Introduce tu dni: ");
                dni = sc.nextLine();
            }
            else if(!dni.substring(0, 8).matches("[00000000-99999999]*")){
                System.out.println("ERROR, el DNI debe tener 8 numeros al final ");
                System.out.println("Introduce tu dni: ");
                dni = sc.nextLine();
            }
            else if(dni.equals("00000000T") || dni.equals("00000001R") || dni.equals("99999999R")){
                System.out.println("ERROR, Dni invalido ");
                System.out.println("Introduce tu dni: ");
                dni = sc.nextLine();
            }
            else {
                valido = true;
            }
        }
        return dni;
    }

    public static void ValidadorDni(String dni){
        String[] dniLetras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J","Z","S","Q","V","H","L","C","K","E" };
        int numeros = Integer.parseInt(dni.substring(0, 8));
        String letra = dni.substring(8);
        int numero = numeros % 23;

        if ( letra.equals( dniLetras[1] )){
            System.out.println("DNI CORRECTO");
        } else {
            System.out.println("DNI INCORRECTO");
        }
    }
}




