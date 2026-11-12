import java.util.Scanner;
/**
 * Realiza un programa que lea una secuencia de números no nulos hasta que se
	introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos
	positivos y cuantos negativos.
 */

public class Ejercicio8 {
	public static void main(String[] args) {
		int num = 0, positivos = 0, negativos = 0;
		boolean hayNegativos = false;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime números no nulos (0 para salir) y te diré si he leído un número negativo además de cuantos positivos y negativos hay");
		
		do {
			num = teclado.nextInt();
			if (num > 0) {
				positivos += 1;
			} 
			if (num < 0) {
				hayNegativos = true;
				negativos += 1;
			}
		} while (num != 0);
		
		if(hayNegativos) {
			System.out.println("Se han leído números negativos");
			System.out.println("==============================");
		}
		
		System.out.println("En esta seuencia se han contado "+ positivos +" números positivos, y "+ negativos +" números negativos");
		
		teclado.close();
	}
}
