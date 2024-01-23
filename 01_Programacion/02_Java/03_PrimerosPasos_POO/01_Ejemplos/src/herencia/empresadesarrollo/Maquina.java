package herencia.empresadesarrollo;

public abstract class Maquina {
    protected int numSerie;
    protected String modelo;
    protected double horasFuncionamiento;
    protected boolean encendido;

    public Maquina(int numSerie, String modelo, double horasFuncionamiento) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.horasFuncionamiento = horasFuncionamiento;
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public abstract void interruptor();
}
