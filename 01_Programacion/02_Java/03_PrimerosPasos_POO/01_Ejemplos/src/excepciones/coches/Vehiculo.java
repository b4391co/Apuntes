package excepciones.coches;

import java.util.Arrays;
import java.util.List;

public class Vehiculo {
    private String matricula;
    private String color;
    private String modelo;
    private int anhoFabricacion;

    public Vehiculo(String matricula, String color, String modelo, int anhoFabricacion) throws ExcepcionesVehiculo{
        validarMatricula(matricula);
        validarColor(color);
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

    private void validarColor(String c) throws ExcepcionesVehiculo {
        String[] colores = { "rojo", "azul", "blanco", "gris", "negro" };
        List<String> listaColores = Arrays.asList(colores);
        if(!listaColores.contains(c.toLowerCase()))
            throw new ExcepcionesVehiculo(ExcepcionesVehiculo.COLOR);
        else
            this.color = c;

    }

    private void validarMatricula(String m) throws ExcepcionesVehiculo{
        if (m.length() != 7)
            throw new ExcepcionesVehiculo(ExcepcionesVehiculo.LONG_MATRICULA);
        else if (!isNumeric(m.substring(0, 4)))
            throw new ExcepcionesVehiculo(ExcepcionesVehiculo.NUM_MATRICULA);
        else if (!isAlpha(m.substring(4, 7)))
            throw new ExcepcionesVehiculo(ExcepcionesVehiculo.LETRAS_MATRICULA);
        else
            this.matricula = m;
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