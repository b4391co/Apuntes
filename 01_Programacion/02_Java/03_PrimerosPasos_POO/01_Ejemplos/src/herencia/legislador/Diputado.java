package herencia.legislador;

public class Diputado extends Legislador {
    public Diputado(String dni, String nombre, int edad, String provinciarepresentadaString, String camara,
            boolean nacional, int anhosResidencia) {
        super(dni, nombre, edad, provinciarepresentadaString, camara, nacional, anhosResidencia);
    }
    
    @Override
    public void getCamaraEnQueTrabaja() {
        System.out.println(camara);        
    }
}
