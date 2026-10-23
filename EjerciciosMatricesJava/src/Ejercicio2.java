
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
			
			System.out.println(m[i][m.length-1]+ "]");
		}
	}
}
