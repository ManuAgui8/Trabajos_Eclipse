//Importacion automatica con ctrl + may + o
	import java.util.Scanner;

/**
 * @author daw
 * @version 1.0
 */
public class HolaMundo {
	
	public static void main (String[] args) {
		// todo lo de aqui ya será nuestro código
		
		
		String nombre ;
		int numero ;
		
		System.out.println("¿Cual es tu nombre?");
		
		//Leer nombre

		Scanner teclado = new Scanner(System.in);
		nombre = teclado.nextLine();
		
		System.out.println("Hola " + nombre);
		
		System.out.println("Dime tu numero");
		
		numero = teclado.nextInt();
		numero = numero + 1;
		
		
		teclado.close();
	}
}