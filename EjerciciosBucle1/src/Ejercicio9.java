/**
 *  Realiza un programa que calcule y escriba la suma y el producto de los 10
	primeros números naturales.
 */

public class Ejercicio9 {
	public static void main(String[] args) {
		
		int suma = 0, mult = 1;
		
		for (int i = 1; i <= 10; i++) {
			suma = suma + i;
			mult = mult * i;
		}
		
		System.out.println("La suma de los primeros 10 naturales es: "+ suma);
		System.out.println("La multiplicación de los primeros 10 naturales es: "+ mult);
	}
}
