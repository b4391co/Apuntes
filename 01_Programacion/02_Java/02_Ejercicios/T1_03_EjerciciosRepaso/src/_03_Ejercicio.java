import java.util.Scanner;

/* Modifica el programa anterior haciendo que al finalizar el programa imprima
por pantalla la cantidad de números pares que se han impreso por pantalla
durante el tiempo que duró el programa hasta que se han escrito 2 números
iguales */

public class _03_Ejercicio {
    public static void main(String[] args) {

        int num1 = solicitarNum();
        int num2 = solicitarNum();
        int contador = 0;

        while ( num1 != num2 ){
            if(num1 < num2){
                contador = recorrerNumeros(num1, num2 , contador);
            } else if ( num1 > num2 ){
                contador = recorrerNumeros(num2, num1 , contador);

            }
            num1 = solicitarNum();
            num2 = solicitarNum();
        }

        System.out.println("-------------------------");
        System.out.println("El programa ha finalizado, se han contado " + contador + " numeros impares");

    }

    public static int solicitarNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce un numero");
        int num = scan.nextInt();
        return num;
    }

    public static int recorrerNumeros(int menor, int mayor, int contador){
        System.out.println("-------------------------");
        for (int i = menor; i <= mayor; i++) {
            if( i % 2 != 0) {
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("-------------------------");
        contador--;
        return contador = contadorImpares(contador);
    }

    public static int contadorImpares(int contador){
        contador++;
        return contador;
    }
}