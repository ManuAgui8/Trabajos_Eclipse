import java.util.Scanner;
/**
 * Crea un programa que pida dos cadenas de texto por teclado y luego
	indique si son iguales, además de si son iguales sin diferenciar entre mayúsculas
	y minúsculas.
 */

public class Ejercicio2 {
	public static void main(String[] args) {
		String texto1;
		String texto2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime dos textos y te diré si son iguales sin diferenciar entre minusculas y mayusculas");
		texto1 = teclado.nextLine();
		texto2 = teclado.nextLine();
		
		if (texto1.equalsIgnoreCase(texto2)) {
			System.out.println("Los dos textos son iguales");
		} else {
			System.out.println("Los dos textos no son iguales");

		}
		
		teclado.close();

	}
}
