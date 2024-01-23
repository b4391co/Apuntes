package herencia.seresvivos;

public class Vegetales extends SerVivo {
    private double altura;

    public Vegetales(String nombreCientifico, String nombreComun, double altura) {
        super(nombreCientifico, nombreComun);
        this.altura = altura;
    }

    @Override
    public void alimentacion() {
        System.out.println("Para fabricar sus alimentos toman agua, sales minerales y dióxido de carbono");
    }

}
