import java.util.Scanner;

/**
 * Realiza un programa en java que pida un número entero positivo y nos diga si es
primo o no.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num = 0;
		boolean es_primo = false;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un número y te digo si es primo o no");
		num = teclado.nextInt();
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				es_primo = true;
			}
		}
		
		if (!es_primo) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		
		
		teclado.close();
	}
}
