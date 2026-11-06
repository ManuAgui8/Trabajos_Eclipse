import java.util.Scanner;
/**
 * Validar un número binario
 */

public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String binario;
		
		System.out.println("Dime un numero binario y te digo si es válido o no");
		binario = teclado.nextLine();
		
		System.out.println("Este número binario es: "+ binario.matches("-{0,1}[01]+"));
		
		teclado.close();
	}
}
