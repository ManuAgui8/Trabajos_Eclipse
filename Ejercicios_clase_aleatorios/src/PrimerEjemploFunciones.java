import java.util.Scanner;

public class PrimerEjemploFunciones {
	/**
	 * Función principal
	 * @param args
	 */
	public static void main(String[] args) {
		int x, y, z;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		x = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Introduce 2º número");
		y = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Introduce 3er número");
		z = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("El mayor de los tres es: "+ maximo(x, y, z));
		
		
		teclado.close();
	}
	
	/**
	 * Esta función devuelve el mayor de dos enteros
	 * @param a, b
	 */
	
	public static int maximo (int a, int b) {
		
		if (a > b) {
			return a;
		}
		return b;
	}
	
	/**
	 * Esta función devuelve el mayor de dos reales
	 * @param a, b
	 */
	
	public static double maximo (double a, double b) { //pueden haber dos funciones con el mismo nombre pero devolver
													   //un dato con un valor diferente a la otra función
		if (a > b) {
			return a;
		}
		return b;
	}
	
	/**
	 * Esta función toma primero el valor de la función maximo devuelve con los 2 primeros valores
	 *  y lo vuelve a comparar con el tercer valor para hacer el return con el valor final
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int maximo (int a, int b, int c) { //también se puede sobrecargar funciones, hacer que se deleguen los cargos
		return maximo(maximo(a, b), c);
	}
}
