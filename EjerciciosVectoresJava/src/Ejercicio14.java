import java.util.Arrays;

/**
 * Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores:
1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por
pantalla.
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		int[] v = new int [55];
		int incremento = 1, valor_inicial = 0;
		
		System.out.println("Te voy a mostrar un vector con esta secuencia : (1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5...) hasta introducir la secuencia 10 veces");
		System.out.println("====================================================================");
		
		for (int i = 0; i < v.length; i++) {
			v[i] = valor_inicial - 1 +(i * (incremento + 1));
		}
		
		System.out.println(Arrays.toString(v));
		
		
		
		
		
		
		
		
	}
}
