import java.util.Arrays;
import java.util.Scanner;

/**
 * Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
	escriba M en todas sus posiciones y lo muestre por pantalla.
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int n;
		int m;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un número n que será el tamaño del array, y un número m, que ira en todas las posiciones del vector");
		
		n = teclado.nextInt();
		m = teclado.nextInt();
		
		int v[] = new int[n];
		
		for (int i = 0; i < v.length; i++) {
			v[i] = m;
		}
		
		System.out.println(Arrays.toString(v));
		
		teclado.close();
		
		
	}
	
}
