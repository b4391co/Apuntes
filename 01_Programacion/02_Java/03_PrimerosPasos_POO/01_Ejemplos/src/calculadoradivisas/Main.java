package calculadoradivisas;

public class Main {
    public static void main(String[] args) {
        Finanzas f1 = new Finanzas(0.91);

        System.out.println(f1.dolarToEuro(5) + " Euros");
        System.out.println(f1.euroToDolar(5) + " Dolares");
    }
}