//1. Primer programa: contador n�meros aleatorios
//Este programa generar� un n�mero aleatorio de n�meros aleatorios. Al final mostrar� en cada
//ejecuci�n cuantos ha generado y los mostrar�.

package boletin;
import java.util.Random;
public class ED1T1P {
	static Random rnd=new Random();
	public static void main(String[] args) {
		int veces;
		int contador=0;
		veces = rnd.nextInt(100)+1;
		for(int i = 0; i<veces;i++) {
			contador = 0;
			System.out.println(rnd.nextInt(50));
			contador++;
		}
		System.out.println("Se han generado "+contador+" n�meros aleatorios");
	}
}
