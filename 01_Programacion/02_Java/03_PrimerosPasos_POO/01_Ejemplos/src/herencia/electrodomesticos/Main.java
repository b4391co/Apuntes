package herencia.electrodomesticos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] eArray = new Electrodomestico[10];
        eArray[0] = new Electrodomestico(50, "rojo", 'A', 50);
        eArray[1] = new Electrodomestico(150, "blanco", 'F', 10);
        eArray[2] = new Lavavajillas(300, "blanco", 'D', 30, 15);
        eArray[3] = new Lavavajillas(300, "azul", 'D', 30, 10);
        eArray[4] = new Television(200, "rojo", 'A', 20, 50, true);
        eArray[5] = new Television(200, "rojo", 'C', 20, 50, false);
        eArray[6] = new Television(1100, "rojo", 'F', 10, 17, true);
        eArray[7] = new Television(1100, "rojo", 'E', 10, 17, false);
        eArray[8] = new Lavavajillas(200, "negro", 'A', 40, 15);
        eArray[9] = new Lavavajillas(200, "blanco", 'B', 20, 8);

        double precioElectrodomesticos = 0;
        double precioLavavajillas = 0;
        double precioTelevisores = 0;
        for (int i = 0; i < eArray.length; i++) {
            precioElectrodomesticos += eArray[i].precioFinal();
            if (eArray[i] instanceof Lavavajillas)
                precioLavavajillas += eArray[i].precioFinal();
            if (eArray[i] instanceof Television)
                precioTelevisores += eArray[i].precioFinal();
        }
    
        System.out.println(
        "\nel precio de los Lavavajillas es:        " + precioLavavajillas + 
        "\nel precio de los Televisores es:         " + precioTelevisores + 
        "\nel precio total es:                      " + (precioElectrodomesticos + precioLavavajillas + precioTelevisores));
        
        System.out.println(
        "\nel precio de los Lavavajillas es:        " + Arrays.stream(eArray).filter(lav -> lav instanceof Lavavajillas).mapToDouble(Electrodomestico::precioFinal).sum() + 
        "\nel precio de los Televisores es:         " + Arrays.stream(eArray).filter(tv -> tv instanceof Television).mapToDouble(Electrodomestico::precioFinal).sum() + 
        "\nel precio total es:                      " + Arrays.stream(eArray).mapToDouble(Electrodomestico::precioFinal).sum());
        }
}