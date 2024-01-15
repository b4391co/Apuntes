package sorteos;
import java.util.Random;

public class Moneda extends Sorteo {

    public int lanzar() {
        Random rand = new Random();
        if (rand.nextInt(2) == 0) {
            System.out.println("Cara");
            return 0;
        } else {
            System.out.println("Cruz");
            return 1;
        }
    }
    
}