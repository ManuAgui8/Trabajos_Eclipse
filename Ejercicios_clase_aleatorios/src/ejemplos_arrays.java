/**
 * Dado un vector creado por el usuario, mostrarlo como lo hace la funcion Arrays.toString(v), donde v es un vector
 * 
 * Ejemplo:
 * 
 * int[] v = {10,20,30,40,50}
 * 
 * Deberia mostrar por pantalla
 * [10, 20, 30, 40, 50]
 * Pista: utilizar System.out.print();
 */

public class ejemplos_arrays {
	
	public static void main(String[] args) {
		
		int[] v = {10,20,30,40,50} ;
		
		//TODO Mostrar el vector de fomra correcta
		
		System.out.print("[");
		for (int i = 0; i < (v.length - 1); i++) { //Escribo hasta el penultimo elemento
			System.out.print(v[i] + ", ");
		}
		System.out.print(v[v.length - 1]); //escriblo el ultimo elemento
		System.out.print("]");
	
	}

}
