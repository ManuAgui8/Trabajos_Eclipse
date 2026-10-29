import java.util.Scanner;

/**
 *Necesitamos crear un programa para almacenar las notas de 4 alumnos
	(llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá
	las notas por teclado y luego el programa mostrará la nota mínima, máxima y
	media de cada alumno. 
 */

public class Ejercicio4 {
	public static void main(String[] args) {
			final int NUM_ALUMNOS=4, NUM_NOTAS=5;
			double mayor,menor,suma,media;
			Scanner teclado = new Scanner(System.in);
				
			double[][] notas = new double[NUM_ALUMNOS][NUM_NOTAS];
				
			for (int i = 0; i < notas.length; i++) {
				mayor = notas[i][0];
				menor = notas[i][0];
				suma = 0;
				for (int j = 1; j < notas[i].length; j++) {
					if(notas[i][j] > mayor) {
						mayor = notas[i][j];
					}
					if(notas[i][j] < menor) {
						menor = notas[i][j];
					} 
					suma += notas[i][j];
				media = suma / notas[i].length;
				System.out.println("Máximo alumno " + (i+1) + ": " + mayor);
				System.out.println("Mínimo alumno " + (i+1) + ": " + menor);
				System.out.println("Media alumno " + (i+1) + ": " + media);
				}
				
			}
		teclado.close();	
	}
}
