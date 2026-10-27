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
		double m[][] = new double [NUM_ALUMNOS][NUM_NOTAS];
		double mayor=0, menor=10,suma=0, media;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < m.length; i++) {
			//El elemento m[i] es el vector que representa al alumno i+1
			mayor = m[i][0];
			menor = m[i][0];
			suma = 0;
			for (int j = 0; j < m[i].length; j++) {
				//el valor i representa al alumno i+1
				//el valor j representa la nota (j+1)º del alumno
				if (m[i][j] > mayor) {
					mayor = m[i][j];
				}
				if (m[i][j] < menor) {
					menor = m[i][j];
				}
				//ya he procesado notas[i], que es el alumno i+1
				
				media = suma / m[i].length;
				System.out.println("Máximo alumno "+ (i+1) + ": " + mayor);
				System.out.println("Mínimo alumno "+ (i+1) + ": " + menor);
				System.out.println("Media alumno "+ (i+1) + ": " + media);
			}
			
		}
		
		teclado.close();
	}
}
