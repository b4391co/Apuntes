package herencia.sorteos;
import java.util.Random;

public class Dado extends Sorteo {
    Dado() {
        posibilidades = 6;
    }
    public int lanzar() {
        Random rand = new Random();
        int $num = rand.nextInt(posibilidades) + 1;
        System.out.println($num);
        return $num;
    }
    
}