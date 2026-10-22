import java.util.Scanner;

/**
 * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
	utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
	cuántos valores del array son igual o superiores a R.
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		
		double v[] = new double[100];
		double num;
		int aux = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			v[i] = Math.random();
		}
		
		System.out.println("Dime un numero entre 0 y 1 y te dire cuantos valores del array (de 100 valores entre 0.0 y 1.0) son mayores o iaguales a ese número");
		
		num = teclado.nextDouble();
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] >= num) {
				aux = aux + 1;
			}
		}
		System.out.println("Los valores del vector mayores o iguales a "+ num +" son "+ aux);
		
		teclado.close();
	}

}
