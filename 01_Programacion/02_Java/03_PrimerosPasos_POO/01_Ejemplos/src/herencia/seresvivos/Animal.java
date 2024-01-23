package herencia.seresvivos;

public class Animal extends SerVivo{
    private double peso;
    private double altura;
    
    public Animal(String nombreCientifico, String nombreComun, double peso, double altura) {
        super(nombreCientifico, nombreComun);
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public void alimentacion() {
        System.out.println("necesitan alimentarse de materia orgánica ya elaborada (alimento), producida por los seres autótrofos");
    }
}