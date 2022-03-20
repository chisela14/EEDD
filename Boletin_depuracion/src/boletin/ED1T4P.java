//4. Cuarto programa: ejecución aleatoria
//El programa aumenta y disminuye el valor de un iterador de un bucle. ¿Acaba el bucle o estamos
//ante otro bucle infinito? Usa “Step Into” para ver el comportamiento de las funciones. Plantea
//una solución.

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
