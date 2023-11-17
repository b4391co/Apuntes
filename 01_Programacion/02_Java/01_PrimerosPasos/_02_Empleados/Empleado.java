public class Empleado {
    private String nombre;
    private String dni;
    private double salario;
    private String categoria;
    private Proyecto Proyecto;

    public Empleado(String nombre, String dni, String categoria) {
        this.nombre = nombre;
        this.dni = dni;
        this.categoria = categoria;
        this.salario = setSalarioInicial();
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Proyecto getProyecto() {
        return this.Proyecto;
    }

    public void setProyecto(Proyecto Proyecto) {
        this.Proyecto = Proyecto;
    }


    public double setSalarioInicial(){
        if(getCategoria().equals("empleado")) {
            return 950;
        }
        if(getCategoria().equals("coordinador")) {
            return 1500;
        }
        if(getCategoria().equals("responsable")) {
            return 2200;
        }
        return 0;
    }

    public String getEstadoAnimo() {
        if (getSalario() <= 1000.00) {
            return "Malo";
        } else if (getSalario() > 1000.00 && getSalario() <= 2000.00) {
            return "Medio";
        } else if (getSalario() > 2000.00) {
            return "Alto";
        }
        return "nulo";
    }

    public void mostrarEstado(){
        System.out.println("nombre: " + getNombre() + " ,salario " + getSalario() + " Estado de animo " + getEstadoAnimo()); 
    }

    public void mostrarNuevoEstado(){
        System.out.println("nombre: " + getNombre() + " Sube el sueldo a : " + getSalario() + " Estado de animo " + getEstadoAnimo());
    }


    public void subirSueldo(double bonusSalario){
        setSalario(getSalario() + bonusSalario);
    }

}
