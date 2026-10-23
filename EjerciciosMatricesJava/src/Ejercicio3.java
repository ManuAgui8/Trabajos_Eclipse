import java.util.Scanner;

/**
 * Crea un programa que cree una matriz de tamaño NxM (tamaño
	introducido por teclado) e introduzca en ella NxM valores (también introducidos
	por teclado). Luego deberá recorrer la matriz y al final mostrar por pantalla
	cuántos valores son mayores que cero, cuántos son menores que cero y cuántos
	son igual a cero.
 */

public class Ejercicio3 {
	public static void main(String[] args) {
		int n;
		int m;
		int matriz[][];
		int cont = 1;
		int min = 0;
		int max = 0;
		int ig = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el número de filas de la matriz");
		n = teclado.nextInt();
		System.out.println("Dime le número de columnas de la matriz");
		m = teclado.nextInt();
		
		if (n>0 && m>0) {
			matriz = new int [n][m];
				for (int j = 0; j< matriz.length; j++) {
					System.out.println("Indroduce los valores de la fila "+ cont++);
					for (int k = 0; k < matriz[j].length; k++) {
						matriz[j][k] = teclado.nextInt();
					}
				}
			for (int i = 0; i < matriz.length; i++){
				for (int j = 0;j < matriz[i].length-1; j++){
					if (matriz[i][j] < 0) {
						min = min + 1;
					} if (matriz[i][j] == 0) {
						ig = ig + 1;
					} else {
						max = max + 1;
					}
				}
				
				System.out.println(matriz[i][matriz.length-1]+ "]");
			}
		} else {
			System.out.println("Para los valores de la matriz introduce numeros positivos");
		}
		
		System.out.println("Los valores positivos de la matriz son " + max);
		System.out.println("Los valores negativos de la matriz son " + min);
		System.out.println("Los valores iguales a 0 de la matriz son " + ig);

		
		
		
		
		teclado.close();
		
	}
}
