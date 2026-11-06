import java.util.Scanner;
/**
 * Validar una matrícula de un coche con formato 0000XXX
 */

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String matricula;
		
		System.out.println("Dime una matrícula (formato 0000XXX), y te digo si es válida o no");
		matricula = teclado.nextLine().toLowerCase();
		
		System.out.println("La matrícula es: "+ matricula.matches("[0-9]{4}[a-z]{3}"));
		
		
		teclado.close();
	}
}
