package herencia.empresadesarrollo;

public class Domestico extends Maquina{
    public Domestico(int numSerie, String modelo, double horasFuncionamiento) {
        super(numSerie, modelo, horasFuncionamiento);
    }
    
    @Override
    public void interruptor() {
        this.encendido = (this.encendido == true) ? false : true;
    }
}