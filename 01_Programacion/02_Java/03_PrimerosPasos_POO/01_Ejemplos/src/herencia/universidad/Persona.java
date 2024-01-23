package herencia.universidad;

public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String dni;
    protected char sexo;
    protected double peso;
    protected double altura;

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        if (sexoValido(Character.toUpperCase(sexo))) this.sexo = Character.toUpperCase(sexo);
        else return;
        if(MayorDeEdad(edad)) this.edad = edad;
        else return; 
        this.nombre = nombre;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
    
    private boolean MayorDeEdad(int edad) {
        return (edad >= 18);
    }

    private boolean sexoValido(char sexo) {
        return (sexo == 'H' || sexo == 'M');
    }
    
    public abstract void mostrarInfo();
}