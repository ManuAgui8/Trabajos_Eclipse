import java.util.Scanner;
/**
 * Escribe un programa que lea un valor correspondiente a una distancia
	en millas marinas y escriba la distancia en metros. Sabiendo que una
	milla marina equivale a 1.852 metros
 */

public class Ejercicio7 {
	public static void main(String[] args) {
		
		double millas_marinas = 0.0, kilometros = 0.0, equivalencia = 1.852;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime una distancia en millas marinas (en positivo");
		millas_marinas = teclado.nextDouble();
		
		if (millas_marinas > 0) {
			kilometros = millas_marinas * equivalencia;
			System.out.println("La equivalencia en kilometros es: "+ kilometros +"km");
		} else {
			System.out.println("He dicho en positivo");
		}
		
		teclado.close();
		
	}
}
