import java.util.Scanner;

/**
 * Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego
	muestre la suma de todos los valores.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num = 0;
		int max = 1;
		int min = 1;
		Scanner teclado = new Scanner(System.in);
		int v[] = new int [10];
		
		System.out.println("Escribe 10 número que se almacenarán en un vector y te diré su máximo y su mínimo");
		for (int i = 0; i < v.length; i++) {
			num = teclado.nextInt();
			v[i] = num;
		}
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] > max) {
				max = v[i];
			} 
			
			if (v[i] < min) {
				min = v[i];
			}
			
		}
		
		System.out.println("El número mayor es "+ max);
		System.out.println("El número menor es "+ min);
		
		teclado.close();
	}

}
