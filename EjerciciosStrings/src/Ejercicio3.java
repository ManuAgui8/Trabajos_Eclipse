import java.util.Scanner;
/**
 * Crea un programa que pida por teclado tres cadenas de texto: nombre y
	dos apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por
	la concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo si
	se introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”.

 */

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido1, apellido2, codUsuario;
		
		System.out.println("Dime tu nombre y apellidos y te diré tu código de usuario (las tres primeras letras de cada)");
		nombre = teclado.nextLine().toUpperCase();
		apellido1 = teclado.nextLine().toUpperCase();
		apellido2 = teclado.nextLine().toUpperCase();
		
		codUsuario = nombre.substring(0,3) + apellido1.substring(0,3) + apellido2.substring(0,3);
		
		System.out.println("Tu código de usuario es: "+ codUsuario);
		
		
		teclado.close();

	}
}
