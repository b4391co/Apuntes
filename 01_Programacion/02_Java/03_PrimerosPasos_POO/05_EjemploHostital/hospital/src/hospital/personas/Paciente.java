package hospital.personas;

import java.time.LocalDate;

import hospital.areas.Area;
import hospital.ingresos.Ingreso;

public class Paciente extends Persona {
    private int id;
    private LocalDate fechaIngreso;
    private String patologia;
    private Area area;
    private Ingreso[] ingresos;

    public Paciente() {
        this.id = 0;
        this.fechaIngreso = LocalDate.now();
        this.patologia = "0";
        this.area = new Area();
        this.ingresos=new Ingreso[0];
    }

    public Paciente(String dni, String nombre, int edad, String direccion, int id, LocalDate fechaIngreso,
            String patologia, Area area, Ingreso[] ingresos) {
        super(dni, nombre, edad, direccion);
        this.id = id;
        this.fechaIngreso = fechaIngreso;
        this.patologia = patologia;
        this.area = area;
        this.ingresos = ingresos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Ingreso[] getIngresos() {
        return ingresos;
    }

    public void setIngresos(Ingreso[] ingresos) {
        this.ingresos = ingresos;
    }

    
}
