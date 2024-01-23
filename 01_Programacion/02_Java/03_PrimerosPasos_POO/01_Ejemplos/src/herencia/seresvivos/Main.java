package herencia.seresvivos;

public class Main {
    public static void main(String[] args) {
        SerVivo s1 = new Animal("Canis lupus familiaris", "Perro", 20, 75);
        SerVivo s2 = new Vegetales("Plantae", "planta", 20);

        s1.alimentacion();
        s2.alimentacion();
    }
}
