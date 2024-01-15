package sorteos;
import java.util.Random;

public class Moneda extends Sorteo {

    Moneda() {
        posibilidades = 2;
    }
    public int lanzar() {
        Random rand = new Random();
        if (rand.nextInt(posibilidades) == 0) {
            System.out.println("Cara");
            return 0;
        } else {
            System.out.println("Cruz");
            return 1;
        }
    }
    
}