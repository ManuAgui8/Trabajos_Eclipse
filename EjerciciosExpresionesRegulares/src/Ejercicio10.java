import java.util.Scanner;
/**
 * Validar número real
 */

public class Ejercicio10 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String numReal;
		
		System.out.println("Dime un número real y te digo si es válido o no");
		numReal = teclado.nextLine();
		
		System.out.println("Este número real es: "+ numReal.matches("-*[0-9]*\\.*[0-9]+"));
		
		teclado.close();
	}
}
