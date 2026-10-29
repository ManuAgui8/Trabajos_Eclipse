import java.util.Scanner;
/**
 * Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
	Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
	mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
	por debajo de la media.
 */

public class Ejercicio10 {
	public static void main(String[] args) {
		int tamanio = 0;
		int porDebajoMedia = 0, porEncimaMedia = 0;
		double max = 0, min = 0, media = 0, suma = 0;
		double[] v_alturas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime cuantas alturas quieres introducir");
		tamanio = teclado.nextInt();
		
		System.out.println("Ves diciendome las alturas");
		
		v_alturas = new double[tamanio];
		
		for (int i = 0; i < v_alturas.length; i++) {
			v_alturas[i] = teclado.nextDouble();
		}
		
		min = v_alturas[0];
		
		for (int i = 0; i < v_alturas.length; i++) {
			if (max < v_alturas[i]) {
				max = v_alturas[i];
			}
			
			if (min > v_alturas[i]) {
				min = v_alturas[i];
			}
			
			suma += v_alturas[i];
			
		}
		
		media = suma/v_alturas.length;
		
		System.out.println("La altura máxima de todas estas es: "+ max +" metros");
		System.out.println("La altura mínima de todas estas es: "+ min +" metros");
		System.out.println("La media de todas estas alturas es: "+ media +" metros");

		
		
		for (int i = 0; i < v_alturas.length;i++) {
			if (v_alturas[i] > media) {
				porDebajoMedia++;
			} if (v_alturas[i] < media) {
				porEncimaMedia++;
			}
		}
		
		System.out.println("Las personas que miden por encima de la media son: "+porDebajoMedia);
		System.out.println("Las personas que miden por debajo de la media son: "+porEncimaMedia);
		
		teclado.close();
	}
	
}
