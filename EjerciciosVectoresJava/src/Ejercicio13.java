import java.util.Arrays;
import java.util.Scanner;
/**
 * Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un valor
inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3,
5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al usuario V, I
además de N (nº de valores a crear).
 */

public class Ejercicio13 {
	public static void main(String[] args) {
		
		int valor_inicial = 0, incremento = 0;
		Scanner teclado = new Scanner(System.in);
		int[] v;
		
		System.out.println("Dime de cuantos valores quieres que sea la secuencia aritmética");
		v = new int[teclado.nextInt()];
		
		System.out.println("Dime el valor inicial de la secuencia");
		valor_inicial = teclado.nextInt();
		System.out.println("Dime el incremento de la secuencia");
		incremento = teclado.nextInt();
		
		for (int i = 0 ; i < v.length; i++) {
			v[i] = valor_inicial + (i * incremento);
		}
		
		System.out.println("El valor secuencial se queda así:");
		System.out.println(Arrays.toString(v));
		
		teclado.close();
	}
}
