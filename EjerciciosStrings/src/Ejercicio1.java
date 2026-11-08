import java.util.Scanner;
/**
 * Crea un programa que pida una cadena de texto por teclado y luego
	muestre cada palabra de la cadena en una línea distinta.
 */

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String texto;
		
		System.out.println("Dime un texto y te diré cada palabra en una linea diferente");
		texto = teclado.nextLine();
		
		String[] resultadoSplit = texto.split(" ");
		
		for(String itemSplit : resultadoSplit) {
			System.out.println(itemSplit);
		}
		
		
		
		teclado.close();
	}
}
