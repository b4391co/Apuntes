package banco;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Titular {
    public String nombre;
    public LocalDate fechaNacimiento;
    public String dni;
    public char sexo;
    public String direccion;

    final char SEXO_DEFAULT = 'H';
    final int DIAS_MAYORIA_EDAD = 6570;

    public Titular() {
        this.nombre = "";
        this.fechaNacimiento = LocalDate.of(1999,01,01);
        this.dni = "";
        this.sexo = SEXO_DEFAULT;
        this.direccion = "";
    }
    
    public Titular(String nombre, LocalDate fechaNacimiento, char sexo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = ""; 
        this.sexo = sexo;
        this.direccion = "";
    }

    public Titular(String nombre, LocalDate fechaNacimiento, String dni, char sexo, String direccion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean esMayorDeEdad() {
        return(ChronoUnit.DAYS.between(fechaNacimiento, LocalDate.now()) > DIAS_MAYORIA_EDAD);
    }

    public void comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M' ) System.out.println("Sexo correcto");
        else this.sexo = SEXO_DEFAULT;
    }

}