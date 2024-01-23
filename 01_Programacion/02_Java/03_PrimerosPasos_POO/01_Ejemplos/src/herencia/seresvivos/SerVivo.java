package herencia.seresvivos;

public abstract class SerVivo {
    protected String nombreCientifico;
    protected String nombreComun;

    public SerVivo(String nombreCientifico, String nombreComun) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public abstract void alimentacion();   
}