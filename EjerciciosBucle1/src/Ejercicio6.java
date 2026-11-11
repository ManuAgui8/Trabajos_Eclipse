import java.util.Scanner;

/**
 * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
	de si ha leído algún número negativo o no.
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num = 1, contador = 0, esNegativo = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime 10 números no nulos y te digo si hay alguno negativo");
		
		do {
			num = teclado.nextInt();
			if (num < 0) {
				esNegativo += 1;
			} 
			if (num == 0) {
				contador -= 1;
				System.out.println("Introduce números no nulos (distintos de 0");
			}
			contador+= 1;
		} while (contador < 10);
		
		System.out.println("Se han contado "+ esNegativo +" negativos");
		
		teclado.close();
	}
	
}
