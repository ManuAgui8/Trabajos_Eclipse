import java.util.Scanner;
/**
 * Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
	uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
		double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
 */

public class Ejercicio6 {
	public static void main(String[] args) {
		
		double[] precios = new double [5];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < precios.length; i++) {
			System.out.println("Dime el " + (i + 1) + "º precio");
			precios[i] = teclado.nextInt();
			teclado.nextLine();
		}
			
		System.out.println("Los precios con IVA son los siguientes:");

		for (int i = 0; i < precios.length; i++) {
			System.out.println("El "+ (i + 1) + "º precio con IVA es: "+ precioConIVA(precios[i]));
		}
		
		teclado.close();

	}
	
	public static double precioConIVA(double precio) {
		return precio * 1.21;
	}
}
