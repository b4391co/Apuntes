package edu.gorilas.excepciones;

public class ExcepcionesMenu extends Exception {
    public static final int NUMERO_INCORRECTO = 1;
    public ExcepcionesMenu(int e) {
        super (devolverError(e));
    }

    public static String devolverError(int e) {
        switch (e) {
            case NUMERO_INCORRECTO:
                return "Numero incorrecto";
            default:
                return "numero invalido";
        }
    }
}
