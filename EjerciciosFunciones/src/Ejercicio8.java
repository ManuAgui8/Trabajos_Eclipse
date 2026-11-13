import java.util.Scanner;
/**
 * Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
	productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
		int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
		int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
		double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 */

public class Ejercicio8 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n;
		
		System.out.println("Dime un número n y te dire desde 1 hasta n, su sumatorio, su productorio, y su valor intermedio");
		n = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("El sumatorio de 1 a "+ n +" = "+ suma1aN(n));
		System.out.println("El productorio de 1 a "+ n +" = "+ producto1aN(n));
		System.out.println("El valor intermedio de 1 a "+ n +" = "+ intermedio1aN(n));


		teclado.close();
	}
	
	public static int suma1aN (int n) {
		int sumatorio = 0;
		for (int i = 1; i <= n; i++) {
			sumatorio += i;
			}
		return sumatorio;
	}
	
	public static int producto1aN (int n) {
		int productorio = 1;
		for (int i = 1; i <= n; i++) {
			productorio *= i;
			}
		return productorio;
	}
	
	public static double intermedio1aN (double n) {
		return  n/2;
	}
}
