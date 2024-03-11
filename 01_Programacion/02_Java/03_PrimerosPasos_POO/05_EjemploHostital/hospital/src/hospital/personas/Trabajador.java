package hospital.personas;

import hospital.areas.Area;
import java.time.LocalDate;


public class Trabajador extends Persona {

    private LocalDate fechaIncorporacion;
    private Area area;
    private String cargo;
    private double sueldo;

    public Trabajador(String dni, String nombre, int edad, String direccion, LocalDate fechaIncorporacion, Area area,
            String cargo, double sueldo) {
        super(dni, nombre, edad, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
        this.area = area;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }



    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }
    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
    public Area getArea() {
        return area;
    }
    public void setArea(Area area) {
        this.area = area;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
