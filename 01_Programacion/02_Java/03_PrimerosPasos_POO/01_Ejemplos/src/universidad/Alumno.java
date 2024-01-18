package universidad;

public class Alumno extends Persona {
    protected String escuela;
    protected String grado;

    public Alumno(String nombre, int edad, String dni, char sexo, double peso, double altura, String escuela, String grado) {
        super(nombre, edad, dni, sexo, peso, altura);
        this.escuela = escuela;
        this.grado = grado;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(
            "\nNombre:  " + this.nombre +
            "\nedad:    " + this.edad +
            "\ndni:     " + this.dni +
            "\nsexo:    " + this.sexo +
            "\npeso:    " + this.peso +
            "\naltura:  " + this.altura +
            "\nescuela: " + this.escuela +
            "\ngrado:   " + this.grado
        );
    }
}