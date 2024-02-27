package excepciones.empleados;

public class ExcepcionEmpleado extends Exception {

    static final int DNI_LONGITUD_INVALIDA = 0;
    static final int LETRA_DNI = 1;
    static final int NOMBRE_LENGHT = 2;
    static final int NOMBRE_LETRAS = 3;
    static final int EDAD_LENGHT = 4;
    static final int EDAD_LETRA = 5;
    static final int SALARIO_LENGHT = 6;

    public ExcepcionEmpleado(int e) {
        super(getErrorMessage(e));
    }

    public static String getErrorMessage(int e){
        switch (e) {
            case DNI_LONGITUD_INVALIDA:
                return "Error: DNI_LONGITUD_INVALIDA: longitud dni invalida";
            case LETRA_DNI:
                return "Error: LETRA_DNI: letra dni invalida";
            case NOMBRE_LENGHT:
                return "Error: NOMBRE_LENGHT: logitud de nombre incorrecta ( > 20 )";
            case NOMBRE_LETRAS:
                return "Error: NOMBRE_LETRAS: el nombre solo puede conener letras";
            case EDAD_LENGHT:
                return "Error: EDAD_LENGHT: logitud edad invalida ( > 3 )";
            case EDAD_LETRA:
                return "Error: EDAD_LETRA: la edad no puede contener caracteres";
            case SALARIO_LENGHT:
                return "Error: SALARIO_LENGHT: logitud salario invalido ( > 5 )";
            default:
                return "Error desconocido";
        }
    }
}