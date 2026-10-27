import java.util.Scanner;
/**
 * Escribe un programa que dado el precio de un artículo y el precio de
	venta real nos muestre el porcentaje de descuento realizado.
 */

public class Ejercicio6 {
	public static void main(String[] args) {
		
		double precio_real = 0.0, precio = 0.0, porcentaje = 0.0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el precio real del artículo");
		precio_real = teclado.nextDouble();
		System.out.println("Dime el precio que has pagado por el artículo");
		precio = teclado.nextDouble();
		
		if (precio_real > precio) {
			porcentaje = ((precio_real-precio) * 100)/precio_real;
			System.out.println("El porcentaje de descuento realizado es del "+ porcentaje +"%");
		} else {
			System.out.println("Como vas a pagar más despues de un descuento");
		}
		
		teclado.close();
	}
}
