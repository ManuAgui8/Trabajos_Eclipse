/**
 * Crea un programa que cree una matriz de tamaño 5x5 que almacene los
	números del 1 al 25 y luego muestre la matriz por pantalla.
 */

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int m[][] = new int [5][5];
		int cont = 1;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = cont++;
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
