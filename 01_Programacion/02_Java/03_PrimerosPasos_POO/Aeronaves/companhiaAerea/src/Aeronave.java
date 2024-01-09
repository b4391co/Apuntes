public class Aeronave {
    private String id;
    private int numPasajeros;
    private int autonomiaMaxmia;
    private String modelo;

    public Aeronave(String id, int numPasajeros, int autonomiaMaxmia, String modelo) {
        this.id = id;
        this.numPasajeros = numPasajeros;
        this.autonomiaMaxmia = autonomiaMaxmia;
        this.modelo = modelo;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumPasajeros() {
        return this.numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getAutonomiaMaxmia() {
        return this.autonomiaMaxmia;
    }

    public void setAutonomiaMaxmia(int autonomiaMaxmia) {
        this.autonomiaMaxmia = autonomiaMaxmia;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}