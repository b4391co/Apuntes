public class Coche extends Vehiculo{
    
    private int puertas;
    private String matricula;

    public Coche(String marca,int puertas, int ruedas, String motor, int estado_motor, String matricula) {
        super(marca, ruedas, motor, estado_motor);
        puertas = puertas;
        matricula = matricula;
    }


    public int getPuertas() {
        return this.puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double calcularHoras(){
        int multiplicador = multiplicadorMotor();
        return ((10 - getEstado_motor())/2) * multiplicador;
    }
}