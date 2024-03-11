package hospital.areas;

public class Area {
    private int id;
    private String especialidad;
    
    public Area() {
        this.id = 0;
        this.especialidad = "0";
    }
    public Area(int id, String especialidad) {
        this.id = id;
        this.especialidad = especialidad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}