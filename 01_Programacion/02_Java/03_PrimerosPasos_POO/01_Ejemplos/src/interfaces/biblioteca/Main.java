package interfaces.biblioteca;

public class Main {
    public static void main(String[] args) {

        Prestable[] biblioteca = new Prestable[3];
        biblioteca[0] = new Libro(123, "Libro1", 2000);
        biblioteca[1] = new Revista(223, "Revista1", 2010, 1);
        biblioteca[2] = new Libro(124, "Libro2", 2022);

        biblioteca[1].prestar();

        for (Prestable p : biblioteca) {
            System.out.println(p.toString());
        }
    }
}