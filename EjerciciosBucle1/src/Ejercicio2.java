/**
 * Realiza un programa que muestre los números pares comprendidos entre el 1 y
	el 200. Para ello utiliza un contador y suma de 2 en 2.
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		
		System.out.println("Estos son los números pares comprendidos entre el 1 y el 200 (contando de 2 en 2): ");
		
		for (int i = 2; i <= 200; i+=2) {
			System.out.println(i);
		}
	}
}
