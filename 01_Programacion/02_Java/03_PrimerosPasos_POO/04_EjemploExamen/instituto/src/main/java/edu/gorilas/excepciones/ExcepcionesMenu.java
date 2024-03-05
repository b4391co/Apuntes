package edu.gorilas.excepciones;

public class ExcepcionesMenu extends Exception {
    public static final int ANHO_INCORRECTO = 1;
    public static final int MES_INCORRECTO = 2;
    public static final int DIA_INCORRECTO = 3;
    public static final int DNI_INCORRECTO = 4;
    public static final int DNI_LENGHT = 5;
    public static final int ESPECIALIDAD_INCORRECTA = 6;
    public ExcepcionesMenu(int e) {
        super (devolverError(e));
    }

    public static String devolverError(int e) {
        switch (e) {
            case ANHO_INCORRECTO:
                return "Año incorrecto";
            case MES_INCORRECTO:
                return "mes incorrecto";
            case DIA_INCORRECTO:
                return "dia incorrecto";
            case DNI_LENGHT:
                return "dni incorrecto";
            case ESPECIALIDAD_INCORRECTA:
                return "Especialidad incorrecta";
            default:
                return "numero invalido";
        }
    }
}
