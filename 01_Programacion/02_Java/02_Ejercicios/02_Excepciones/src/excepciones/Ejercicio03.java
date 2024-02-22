package excepciones;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        while (true)
            comprobarAnho(pedirAnho());
    }
    
    public static void comprobarAnho(int anho) {
        try {
            if (anho < 0)
                throw new Excepciones("El año debe ser positivo");
            System.out.println("Año correcto");
        } catch (Excepciones e) {
            System.out.println(e.getMessage());
        }
    }

    public static int pedirAnho(){
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un año");
        return sc.nextInt();
    }
}
