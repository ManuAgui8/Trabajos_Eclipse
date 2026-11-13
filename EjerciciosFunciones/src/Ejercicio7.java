import java.util.Scanner;
/**
 * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
	su perímetro. Implementa y utiliza las funciones:
		double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
		double areaRectangulo(double ancho, double alto) // Devuelve el área
 */

public class Ejercicio7 {
	public static void main(String[] args) {
		double ancho, alto;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el ancho de un rectángulo (cm)");
		ancho = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("Ahora dime el alto de ese rectángulo (cm)");
		alto = teclado.nextDouble();
		teclado.nextLine();
		
		if (alto > 0 && ancho > 0 ) {
			System.out.println("El perímetro de este rectángulo es: "+ perimetroRectangulo(ancho, alto) +"cm");
			System.out.println("El área de este rectángulo es: "+ areaRectangulo(ancho, alto) +"cm²");
		} else {
			System.out.println("Dime medidas positivas (>0)");
			System.exit(0);
		}

		teclado.close();
	}
	
	public static double perimetroRectangulo (double ancho, double alto) {
		return (2 * ancho) + (2 * alto);
	}
	
	public static double areaRectangulo (double ancho, double alto) {
		return ancho * alto;
	}
}
