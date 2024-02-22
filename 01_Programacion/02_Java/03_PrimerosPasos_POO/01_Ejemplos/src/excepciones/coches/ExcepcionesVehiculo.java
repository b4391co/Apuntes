package excepciones.coches;

public class ExcepcionesVehiculo extends Exception {
    public ExcepcionesVehiculo(int i) {
        super(obtenerMensaje(i));
    }

    private static String obtenerMensaje(int i) {
        switch (i) {
            case 0:
                return "Caso " + i + ": Longitud matricula invalida";
            case 1:
                return "Caso " + i + ": Numeros matircula invalidos";
            case 2:
                return "Caso  " + i + ": Letras matricula invalidos";
            case 3:
                return "Caso  " + i + ": Color invalido";
            // Agrega más casos según sea necesario
            default:
                return "Caso no reconocido: ";
        }
    }
}
