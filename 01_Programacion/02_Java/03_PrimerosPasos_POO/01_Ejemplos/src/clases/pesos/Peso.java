package clases.pesos;

public class Peso {
    final double LIBRAS_KG = 2.20462;
    final double LINGOTES_KG = 14.59;
    final double ONZAS_KG = 0.02835;
    final double PENIQUE_KG = 0.02835;
    final double QUINTAL_KG = 43.3; 
    final double G_KG = 1000;
    
    private double pesoKg;
    private double peso;
    private String medida;

    public Peso(double peso, String medida) {
        switch (medida) {
            case "Lb":
                this.pesoKg = peso / LIBRAS_KG;
                break;
            case "Li":
                this.pesoKg = peso / LINGOTES_KG;
                break;
            case "Oz":
                this.pesoKg = peso / ONZAS_KG;
                break;
            case "P":
                this.pesoKg = peso / PENIQUE_KG;
                break;
            case "K":
                this.pesoKg = peso;
                break;
            case "G":
                this.pesoKg = peso / G_KG;
                break;
            case "Q":
                this.pesoKg = peso / QUINTAL_KG;
                break;
            default:
                System.out.println("Medida invalida");
                this.pesoKg = 0;
                break;
        }
        this.peso = peso;
        this.medida = medida;
    }

    public double getPesoKg() {
        return this.pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getMedida() {
        return this.medida;
    }


    public double getLibras() {
        return pesoKg * LIBRAS_KG;
    }
    
    public double getLingotes() {
        return this.getLibras() * LINGOTES_KG;
    }

    public double getPeso(String medida) {
        switch (medida) {
            case "Lb":
                return pesoKg * LIBRAS_KG;
            case "Li":
                return pesoKg * LINGOTES_KG;
            case "Oz":
                return pesoKg * ONZAS_KG;
            case "P":
                return pesoKg * PENIQUE_KG;
            case "K":
                return pesoKg;
            case "G":
                return pesoKg * G_KG;
            case "Q":
                return pesoKg * QUINTAL_KG;
            default:
                System.out.println("Medida invalida");
                return 0;
        }
    }
}