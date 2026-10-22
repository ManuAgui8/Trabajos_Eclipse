import java.util.Scanner;

/**
 * Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego
	muestre la suma de todos los valores.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num = 0;
		int v[] = new int[10];
		int suma = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime 10 números y te digo la suma de todos ellos");
		
		for (int i = 0; i < v.length; i++) {
			num = teclado.nextInt();
			suma = suma + num;
		}
		
		System.out.println("La suma de todos ellos es "+ suma);
		
		teclado.close();
	}

}