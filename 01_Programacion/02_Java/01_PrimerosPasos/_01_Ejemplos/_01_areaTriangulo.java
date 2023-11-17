import java.util.Scanner;

public class _01_areaTriangulo {
	
	public static float calcularArea(float base, float altura) {
		float total = ( base * altura ) / 2;
		return total;
	}

	public static void main(String args[]){
		int base = 5;
		int altura = 10;
		float resultado = calcularArea(base,altura);
		System.out.println("el resultado es:" + resultado);
	}
}