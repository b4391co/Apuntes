import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String respuesta = "pera";
        System.out.println("Blanco por dentro, verde por fuera,\n si quieres saberlo, ¡espera!");
        String respuestaIntroducida = scan.nextLine();

        for( int i = 1; i <= 2; i++){
            if (respuesta.equalsIgnoreCase(respuestaIntroducida)){
                System.out.println("respesta Correcta!!");
                break;
            } else {
                if(i == 2) {
                    System.out.println("respesta Incorrecta, no quedan intentos");
                } else {
                    System.out.println("respesta Incorrecta, prueba otra vez");
                    respuestaIntroducida = scan.nextLine();
                }
            }
        }
    }
}