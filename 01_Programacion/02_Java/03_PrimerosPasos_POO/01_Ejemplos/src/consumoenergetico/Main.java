package consumoenergetico;

public class Main {
    public static void main(String[] args) {
        Aparato a1 = new Aparato(50);
        Aparato a2 = new Aparato(25);

        System.out.println(a1.getConsumoTotal());
        a1.encender();
        System.out.println(a1.getConsumoTotal());
        a2.encender();
        System.out.println(a1.getConsumoTotal());
        a2.apagar();
        System.out.println(a1.getConsumoTotal());
    }
}