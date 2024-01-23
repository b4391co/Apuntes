package herencia.vuelos;

public class AvionTurbina {
    public int numTurbnas;
    public int numMotores;

    public AvionTurbina(String id, int numPasajeros, int autonomiaMaxima, String modelo, int numTurbnas, int numMotores) {
        super(id,numPasajeros,autonomiaMaxima,modelo);
        this.numTurbnas = numTurbnas;
        this.numMotores = numMotores;
    }

    public int getNumTurbnas() {
        return this.numTurbnas;
    }

    public void setNumTurbnas(int numTurbnas) {
        this.numTurbnas = numTurbnas;
    }

    public int getNumMotores() {
        return this.numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

}