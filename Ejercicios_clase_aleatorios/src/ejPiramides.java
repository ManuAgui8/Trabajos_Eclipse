import java.util.Scanner;
/**
 * Figuras con strings
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
		
		filas = 5;
		
		System.out.println("=====================");
		System.out.println("Un cuadrado hueco:");
		System.out.println("=====================");
		
		for(int i = 0; i <= filas; i++) {
			for(int j = 0; j <= filas; j ++) {
				if (i == 0 || i == filas - 1 || j == 0 || j == filas - 1) {
					System.out.println("*");
				} else {
					System.out.print(" ");
				}
				
						
			}
		}
		
		System.out.println("=====================");
		System.out.println("Un cuadrado hueco:");
		System.out.println("=====================");
		
		
		int n = 5;
        String resultado2 = "";

        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {
                if (fila == 0 || fila == n - 1 || col == 0 || col == n - 1) {
                    resultado2 += "* ";
                } else {
                    resultado2 += "  ";
                }
            }
            resultado2 += "\n";
        }

        System.out.println(resultado2);
		
		teclado.close();
	}
}
