package excepciones.coches;

public class ExcepcionesVehiculo extends Exception {
    static final int LONG_MATRICULA = 0;
    static final int NUM_MATRICULA = 1;
    static final int LETRAS_MATRICULA = 2;
    static final int COLOR = 3;

    public ExcepcionesVehiculo(int i) {
        super(obtenerMensaje(i));
    }

    private static String obtenerMensaje(int i) {
        switch (i) {
            case LONG_MATRICULA:
                return "Caso " + LONG_MATRICULA + ": Longitud matricula invalida";
            case NUM_MATRICULA:
                return "Caso " + NUM_MATRICULA + ": Numeros matircula invalidos";
            case LETRAS_MATRICULA:
                return "Caso  " + LETRAS_MATRICULA + ": Letras matricula invalidos";
            case COLOR:
                return "Caso  " + COLOR + ": Color invalido";
            // Agrega más casos según sea necesario
            default:
                return "Caso no reconocido: ";
        }
    }
}
