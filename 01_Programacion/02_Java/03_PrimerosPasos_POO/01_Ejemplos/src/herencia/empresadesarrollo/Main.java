package herencia.empresadesarrollo;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");
        
        Maquina m1 = new Industrial(001, "trenta", 20, 11);
        Maquina m2 = new Domestico(002, "decasa", 2);

        System.out.println(m1.isEncendido());
        m1.interruptor();
        System.out.println(m1.isEncendido());
    }
}