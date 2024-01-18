package universidad;

public class AlumnoInternacional extends Alumno {
    private String pais;

    public AlumnoInternacional(String nombre, int edad, String dni, char sexo, double peso, double altura,
            String escuela, String grado, String pais) {
        super(nombre, edad, dni, sexo, peso, altura, escuela, grado);
        this.pais = pais;
    }

    public void mostrarInfo() {
        if (this.nombre != null) 
        System.out.println(
            "\n===========================" +
            "\nNombre:  " + this.nombre +
            "\nedad:    " + this.edad +
            "\ndni:     " + this.dni +
            "\nsexo:    " + this.sexo +
            "\npeso:    " + this.peso +
            "\naltura:  " + this.altura +
            "\nescuela: " + super.escuela +
            "\ngrado:   " + this.grado +
            "\nPais:    " + this.pais
        );
    }
}