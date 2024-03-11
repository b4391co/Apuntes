package hospital.ingresos;

import hospital.areas.Area;
import java.time.LocalDate;


public class Ingreso {
    private LocalDate fechaIngreso;
    private LocalDate fechaAlta;
    private Area area;

    public Ingreso() {
        this.fechaIngreso = LocalDate.now();
        this.fechaAlta = LocalDate.now();
        this.area = new Area();
    }

    public Ingreso(LocalDate fechaIngreso, LocalDate fechaAlta, Area area) {
        this.fechaIngreso = fechaIngreso;
        this.fechaAlta = fechaAlta;
        this.area = area;
    }



    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public Area getArea() {
        return area;
    }
    public void setArea(Area area) {
        this.area = area;
    }
}
