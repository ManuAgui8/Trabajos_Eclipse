import java.util.Arrays;
/**
 *Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
	primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
	primer array al segundo array en orden inverso, y mostrar ambos por pantalla. 
 */

public class Ejercicio11 {
	public static void main(String[] args) {
		
		int[] v = new int[100];
		int[] vInverso = new int[100];

		for (int i = 0; i < v.length; i++) {
			v[i] = i+1;
		}
		
		for (int i = 0; i < v.length; i++) {
			vInverso[i] = v[v.length - 1 - i];
		}
		
		System.out.println(Arrays.toString(v));
		System.out.println(Arrays.toString(vInverso));
	}
}
