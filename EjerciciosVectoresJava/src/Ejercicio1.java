import java.util.Scanner;

/**
 * Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego
	muestre todos sus valores.
 */


public class Ejercicio1 {

	public static void main(String[] args) {

		int num = 0;
		Scanner teclado = new Scanner(System.in);
		int v[] = new int [10];
		
		
		System.out.println("Dime 10 números que se guardarán en un vector que te mostraré cuando acabes");
		for (int i = 0; i < v.length; i++) {
			num = teclado.nextInt();
			v[i] = num;
		}
		
		System.out.print("[");
		for (int i = 0; i < (v.length - 1); i++) {
			System.out.print(v[i] + ", ");
		}
		System.out.print(v[v.length - 1]);
		System.out.print("]");
		
		teclado.close();
	}
	

}
