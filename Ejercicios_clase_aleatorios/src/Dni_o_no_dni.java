import java.util.Scanner;
/**
 * Determina si un string que representa un dni es valido o no
 * 
 * Para que sea válido debe cumplir lo siguiente:
 * 	- Debe tener longitud 9
 * 	- Los primeros 8 caracteres deben ser cifras enteras
 * 	- El ultimo caracter debe ser una letra
 * 	- Se debe cumplir la regla del DNI, es decir:	
 * 		Al tomar el número del DNI, el resultado de obtener el módulo 23
 * 		del número debe asociarse a la siguiente tabla:
 * 		0: T | 1: R | 2: W | 3: A | 4: G | 5: M | 6: Y | 7: F | 8: P | 9: D
 * 		| 10: X | 11: B | 12: N | 13: J | 14: Z | 15: S | 16: Q | 17: V | 18 : H
 * 		| 19: L | 20: C | 21: K | 22: E
 */

public class Dni_o_no_dni {
	public static void main(String[] args) {
		final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
		String dni;
		Scanner teclado = new Scanner(System.in);
		boolean esValido = false;
		
		System.out.println("Introduce dni");
		dni = teclado.nextLine().toUpperCase();
		//TODO: Determinar si el dni es válido
		
		
				
		if (dni.length() == 9) {
			int valorAscii = (int) dni.charAt(8);
			if ((valorAscii >= 65) && (valorAscii <= 90)) {
				esValido = true;
			}	
			
			
		}
	
		if (esValido) {
			System.out.println("es válido");
		} else {
			System.out.println("No es válido");
		}
		
		
		
		
		
		
		
		teclado.close();
	}
}
