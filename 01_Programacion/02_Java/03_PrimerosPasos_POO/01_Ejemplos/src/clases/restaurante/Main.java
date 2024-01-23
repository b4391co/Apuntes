package clases.restaurante;

public class Main {
    public static void main(String[] args) {
        Restaurante r1 = new Restaurante(50, 190);

        System.out.println(r1.disponibilidadClientes());
    }
}