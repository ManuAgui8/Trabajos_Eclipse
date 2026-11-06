import java.util.Scanner;
/**
 * Validar una IP
 */

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime una ip aleatoria y te digo es es valida o no (true o false)");
		String ip = teclado.nextLine();
			
		System.out.println("La ip es: "+ ip.matches("[0-255]*\\.[0-255]*\\.[0-255]*\\.[0-255]*"));
		
		
		teclado.close();
		
	}
}
