package org.ed.junit.ju11testconsole;

public class Matriz {
	
	private int columnas=0;
	private int filas=0;
	
	Matriz (int c, int f) {
		columnas=c;
		filas=f;
	}
	
	public void pintaMatriz() {
		for (int i=0; i<columnas; i++) {
			for (int j=0; j<filas; j++) {
				System.out.print("X ");
			}
			System.out.print("\n");
		}
	}
}
