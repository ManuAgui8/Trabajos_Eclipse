import java.util.Scanner;

/**
 * Realiza un programa en java que pida un número entero positivo y nos diga si es
primo o no.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num = 0;
		int primo = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un número y te digo si es primo o no");
		num = teclado.nextInt();
		
		for (int i = 1; i <= Math.sqrt(num); i++) {
			primo = num / i;
		}
		
		if (primo % 1 == primo) {
			System.out.println("El numero no es primo");
		} else {
			System.out.println("El numero es primo");
		}
		
		
		teclado.close();
	}
}
