import java.util.Scanner;

/**
 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros
	aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en
	qué posiciones del array aparece N.
 */

public class Ejercicio9 {
	public static void main(String[] args) {
		
		int v[] = new int[100];
		int n = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (1+ Math.random() * 10);
		}
		
		System.out.println("Dime un valor n y te digo en que posiciones del array (de 100 números entre 1 y 10) aparece ese valor n");
		
		n = teclado.nextInt();
		
		System.out.println("El valor "+ n +"Está en la posición del array: ");
		
		for (int i = 0; i < v.length; i++) {
			if (n == v[i]) {
				System.out.print(i + 1 +". ");
			}
		}
		
		teclado.close();
	}
}
