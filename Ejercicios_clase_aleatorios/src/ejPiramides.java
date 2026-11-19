import java.util.Scanner;
/**
 * Piramides con strings
 */

public class ejPiramides {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int filas;
		String caracter = "a";
		
		System.out.println("Dime de cuantas filas quieres que sea la pirámide");
		filas = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("=====================");
		System.out.println("Piramide normal:");
		System.out.println("=====================");

		
		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= filas - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print(caracter);
			}
			
			System.out.println();
		}
		
		System.out.println("=====================");
		System.out.println("Pirámide invertida:");
		System.out.println("=====================");

		
		for (int i = filas; i >= 1; i--) {
			for(int j = 1; j <= filas - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print(caracter);
			}
			
			System.out.println();
		}
		
		teclado.close();
	}
}
