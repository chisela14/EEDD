//4. Cuarto programa: ejecuci?n aleatoria
//El programa aumenta y disminuye el valor de un iterador de un bucle. ?Acaba el bucle o estamos
//ante otro bucle infinito? Usa ?Step Into? para ver el comportamiento de las funciones. Plantea
//una soluci?n.

package boletin;
import java.util.Random;
public class ED1T4P {
	static Random rnd=new Random();
	public static void main(String[] args) {
		int iterador = 0;
		while(iterador>=0) {
			iterador = aumentar(iterador);
			iterador = disminuir(iterador);
		}
	}
	public static int aumentar(int a) {
		int aumento = rnd.nextInt(50);
		System.out.println("Aumentando "+aumento);
		return (a + aumento);
	}
	public static int disminuir(int a) {
		int disminucion = rnd.nextInt(10);
		System.out.println("Disminuyendo "+disminucion);
		return (a - disminucion);

	}
}
//Breakpoint en la l?nea 12.
//Estamos ante un bucle infinito porque el valor que disminuye es menor que el que aumenta
//as? que el iterador siempre ser? mayor que cero.
//Una posible soluci?n ser?a cambiar la condici?n del while o a?adir condicionales dentro del while.