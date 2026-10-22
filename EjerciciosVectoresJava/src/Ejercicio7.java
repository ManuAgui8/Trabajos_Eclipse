import java.util.Arrays;
import java.util.Scanner;

/**
 * Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos
	los valores desde P hasta Q, y lo muestre por pantalla.
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int p;
		int q;
		int v[] = null;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime dos número y te dire un array que contenga todos los valores entre esos dos números");
		p = teclado.nextInt();
		q = teclado.nextInt();
		
		
		if (p < q) {
			v = new int[(q-p + 1)];
			for (int i = 0; i < v.length; i++) {
				v[i] = p+i;
			}
		}
		
		if (p > q) {
			v = new int[(p-q + 1)];
			for (int i = 0; i < v.length; i++) {
				v[i] = p-i;
			}
		}
		
		System.out.print(Arrays.toString(v));
		
		
		teclado.close();
	}

}
