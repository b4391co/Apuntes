package interfaces.lifo;

public class Main {
    public static void main(String[] args) {
        Pila p = new Pila(5);
        p.add(8);
        p.add(9);
        p.add(10);
        System.out.println("Obtengo y elimino primer elemento de la pila: " + p.get());
        System.out.println("Obtengo primer elemento de la pila: ");
        System.out.println(p.first());
    }
}
