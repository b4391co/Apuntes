package herencia.empresadesarrollo;

public class Industrial extends Maquina{
    private double potenciaConsumo;

    public Industrial(int numSerie, String modelo, double horasFuncionamiento, double potenciaConsumo) {
        super(numSerie, modelo, horasFuncionamiento);
        this.potenciaConsumo = potenciaConsumo;
    }

    @Override
    public void interruptor() {
        this.encendido = (this.encendido == true) ? false : true;
    }
}
