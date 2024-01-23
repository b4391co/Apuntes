package herencia.electrodomesticos;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class Electrodomestico {
    private double precioBase;
    private String Color;
    private char consumoEnergetico;
    private double peso;

    private final char CONSUMO_DEFAULT = 'F';
    private final String COLOR_DEFAULT = "blanco";

    public Electrodomestico() {
        this.precioBase = 100;
        this.Color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_DEFAULT;
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.Color = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_DEFAULT;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String Color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.Color = comprobarColor(Color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public char getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        return ("ABCDEFabcdef".indexOf(letra) != -1 ) ? Character.toUpperCase(letra) : CONSUMO_DEFAULT;
    }
    
    private String comprobarColor(String color) {
        List<String> colores = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");
        return colores.contains(color.toLowerCase()) ? color.toLowerCase() : COLOR_DEFAULT;
    }
    public Double precioFinal() {
        
        HashMap<Character, Double> precioConsumo = new HashMap<>();
        precioConsumo.put('A',100.0);
        precioConsumo.put('B',80.0); 
        precioConsumo.put('C',60.0); 
        precioConsumo.put('D',50.0); 
        precioConsumo.put('E',30.0); 
        precioConsumo.put('F', 10.0);
        
        return (this.precioBase + precioConsumo.get(this.consumoEnergetico)); 
    }
}