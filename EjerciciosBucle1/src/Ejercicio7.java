import java.util.Scanner;
/**
 * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
	indicando cuántos son positivos y cuantos negativos. 
 */

public class Ejercicio7 {
	public static void main(String[] args) {
		int entero = 0, contador = 0, positivos = 0, negativos = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime 10 números no nulos y te indico cuantos son positivos y cuantos son negativos");
		do {
			entero = teclado.nextInt();
			contador ++;
			if (entero > 0) {
				positivos += 1;
			} 
			if (entero < 0) {
				negativos += 1;
			} 
			if (entero == 0) {
				System.out.println("Introduce números no nulos (distintos de 0");
				contador -= 1;
			}
		} while (contador < 10);
		
		
		
		System.out.println("En estos números hay: " + positivos + " positivos, y: "+ negativos +" negativos");
		
		teclado.close();
	}
}
