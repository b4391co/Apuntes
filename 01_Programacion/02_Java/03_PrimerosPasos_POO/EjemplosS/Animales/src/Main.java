import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Animal> Animales = new ArrayList<>();
        Util util = new Util();

        Perro perro = new Perro (20.5F, 1.05F, "Gran Danes");
        Gato gato = new Gato(20.5F, 1.05F);

        Animales.add(perro);
        Animales.add(gato);

        for(Animal animal: Animales) {
            System.out.println(animal.hacerRuido());
        }

        System.out.println(util.calcularIMC(perro.getPeso(), perro.getAltura()));

    }
}
