package clases.satelites;

public class Main {
    public static void main(String[] args) {
        Satelite s1 = new Satelite(true, 50, 100, 10000);
        Satelite s2 = new Satelite(false, 50, 100, 10000);
        System.out.println(s2.getDistanciaTierra());
        s2.variaAltura(200000);
        System.out.println(s2.getDistanciaTierra());
        System.out.println(s2.getParalelo() + " " + s2.getMeridiano());
        s2.variaPosicion(99, 11);
        System.out.println(s2.getParalelo() + " " + s2.getMeridiano());
    }
}