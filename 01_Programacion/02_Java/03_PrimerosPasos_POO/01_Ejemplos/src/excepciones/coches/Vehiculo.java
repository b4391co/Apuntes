package excepciones.coches;

import java.util.Arrays;
import java.util.List;

public class Vehiculo {
    private String matricula;
    private String color;
    private String modelo;
    private int anhoFabricacion;

    public Vehiculo(String matricula, String color, String modelo, int anhoFabricacion){
        this.matricula = validarMatricula(matricula);
        this.color = validarColor(color);
        this.modelo = modelo;
        this.anhoFabricacion = anhoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnhoFabricacion() {
        return anhoFabricacion;
    }

    public void setAnhoFabricacion(int anhoFabricacion) {
        this.anhoFabricacion = anhoFabricacion;
    }

    private String validarColor(String c) {
        try {
            String[] colores = { "rojo", "azul", "blanco", "gris", "negro" };
            List<String> listaColores = Arrays.asList(colores);
            if(!listaColores.contains(c.toLowerCase()))
                throw new ExcepcionesVehiculo(3);
            return c;
        } catch (ExcepcionesVehiculo e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private String validarMatricula(String m) {
        try {
            if (m.length() != 7)
                throw new ExcepcionesVehiculo(0);
            if (!isNumeric(m.substring(0, 4)))
                throw new ExcepcionesVehiculo(1);
            if (!isAlpha(m.substring(4, 7)))
                throw new ExcepcionesVehiculo(2);
            return m;
        } catch (ExcepcionesVehiculo e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
      
    public static boolean isAlpha(String s) {
        return s != null && s.matches("^[a-zA-Z]*$");
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + ", anhoFabricacion="
                + anhoFabricacion + "]";
    }

    
}