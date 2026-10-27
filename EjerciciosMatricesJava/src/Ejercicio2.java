/**
 * Crea un programa que cree una matriz de 10x10 e introduzca los valores
	de las tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la
	matriz por pantalla.
 */

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int m[][] = new int[10][10];
		
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for (int i = 0; i < m.length; i++){
			System.out.print("[");
			for (int j = 0;j < m[i].length-1; j++){
				System.out.print(m[i][j]+ ", ");
			}
			
			System.out.println(m[i][m[i].length-1]+ "]");
		}
	}
}
