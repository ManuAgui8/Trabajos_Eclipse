/**
 * Realiza un programa que muestre los números pares comprendidos entre el 1 y
	el 200. Esta vez utiliza un contador sumando de 1 en 1. 
 */

public class Ejercicio3 {
	public static void main(String[] args) {
		
		System.out.println("Estos son los números pares comprendidos entre el 1 y el 200 (contando de 1 en 1): ");
		
		int num = 0;
		
		for (int i = 0; i < 100; i++) {
			System.out.println(num += 2);
		}
	}
}
