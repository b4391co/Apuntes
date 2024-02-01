package herencia.legislador;

public abstract class Legislador extends Persona{
    private String provinciarepresentadaString;
    protected String camara;
    private boolean nacional;
    private int anhosResidencia;
    
    public Legislador(String dni, String nombre, int edad, String provinciarepresentadaString, String camara,
            boolean nacional, int anhosResidencia) {
        super(dni, nombre, edad);
        this.provinciarepresentadaString = provinciarepresentadaString;
        this.camara = camara;
        this.nacional = nacional;
        this.anhosResidencia = anhosResidencia;
    }
    
    public abstract void getCamaraEnQueTrabaja();
}