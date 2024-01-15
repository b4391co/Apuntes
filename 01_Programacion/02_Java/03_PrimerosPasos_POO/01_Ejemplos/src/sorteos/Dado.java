package sorteos;
import java.util.Random;

public class Dado extends Sorteo {

    public int lanzar() {
        Random rand = new Random();
        int $num = rand.nextInt(6) + 1;
        System.out.println($num);
        return $num;
    }
    
}