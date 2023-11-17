public abstract class Vehiculo {
    private String marca;
    private int ruedas;
    private String motor;
    private int estado_motor; 


    public Vehiculo(String marca, int ruedas, String motor, int estado_motor) {
        this.marca = marca;
        this.ruedas = ruedas;
        this.motor = motor;
        this.estado_motor = estado_motor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getEstado_motor() {
        return this.estado_motor;
    }

    public void setEstado_motor(int estado_motor) {
        this.estado_motor = estado_motor;
    }

    public double reparar(double hours){
        return hours;
    }

    public int multiplicadorMotor(){
        if (getMotor().equals("gasolina")){
            return 2;
        }
        else if (getMotor().equals("diesel")){
            return 3;
        }
        return 1;
    }

    public double cobrar(double numeroHoras){
        return numeroHoras * 23.5;
    }
    
    public abstract double calcularHoras();
}