import java.util.Scanner;
/**
 * Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
	Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
		double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
 */

public class Ejercicio5 {
	public static void main(String[] args) {
		
		int millas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime una distancia en millas y te lo digo en kilómetros");
		millas = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println(millas +" millas, son: "+ millas_a_kilometros(millas) + " kilometros");
		
		teclado.close();
	}
	
	public static double millas_a_kilometros(int millas) {
		return millas * 1.60934;
	}
}
