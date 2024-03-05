package edu.gorilas.excepciones;

public class Excepciones extends Exception {
    public static final int NUMERO_INCORRECTO = 1;
    public static final int TEXTO_INCORRECTA = 2;
    public Excepciones(int e) {
        super (devolverError(e));
    }

    public static String devolverError(int e) {
        switch (e) {
            case NUMERO_INCORRECTO:
                return "Numero incorrecto";
            case TEXTO_INCORRECTA:
                return "texto incorrecta";
            default:
                return "numero invalido";
        }
    }
}
