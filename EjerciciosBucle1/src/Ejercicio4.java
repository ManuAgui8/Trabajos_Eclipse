import java.util.Scanner;
/**
 * Realiza un programa que muestre los números desde el 1 hasta un número N
	que se introducirá por teclado.
 */

public class Ejercicio4 {
	public static void main(String[] args) {
		
		int num_final = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un número N positivo y te dire los números que hay desde el 1 hasta ese número N");

		do {
			num_final = teclado.nextInt();
			if (num_final < 0) {
				System.out.println("Introduce un número positivo");
			}
		} while (num_final < 0);
		
		System.out.println("Los números del 1 hasta el número "+ num_final +" son: ");
		
		for (int i = 1; i <= num_final; i++) {
			System.out.println(i);
		}
		
		teclado.close();
	}
}
