package herencia.universidad;

public class Docente extends Persona{
    private String materia;

    public Docente(String nombre, int edad, String dni, char sexo, double peso, double altura, String materia) {
        super(nombre, edad, dni, sexo, peso, altura);
        this.materia = materia;
    }

    @Override
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
            "\nmateria: " + this.materia
        );
    }
}