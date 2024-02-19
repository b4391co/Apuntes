public class Moto extends Vehiculo{

    private String matricula;

    public Moto(String marca, int ruedas, String motor, int estado_motor, String matricula) {
        super(marca, ruedas, motor, estado_motor);
        matricula = matricula;
    }


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double calcularHoras(){
        int multiplicador = multiplicadorMotor();
        return ((10 - getEstado_motor())/2.5) * multiplicador;
    }
}