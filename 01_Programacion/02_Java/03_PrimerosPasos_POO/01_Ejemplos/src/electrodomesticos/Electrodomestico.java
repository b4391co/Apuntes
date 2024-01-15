package electrodomesticos;

public class Electrodomestico {
    private double precioBase;
    private String Color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precioBase = 100;
        this.Color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.Color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String Color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.Color = Color;
        this.consumoEnergetico = consumoEnergetico;
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
        return (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F' ) ? letra : 'F';
    }
    
    private char comprobarColor(String color) {
        return (color.toLowerCase() == "blanco" || ) ? color : "blanco";
    }
    
}