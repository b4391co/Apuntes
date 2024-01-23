package interfaces.legislador;

public class Senador extends Legislador {
    public Senador(String dni, String nombre, int edad, String provinciarepresentadaString, String camara,
            boolean nacional, int anhosResidencia) {
        super(dni, nombre, edad, provinciarepresentadaString, camara, nacional, anhosResidencia);
    }

    @Override
    public void getCamaraEnQueTrabaja() {
        System.out.println(camara);
    }

}
