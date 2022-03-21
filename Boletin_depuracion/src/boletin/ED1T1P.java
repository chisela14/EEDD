//1. Primer programa: contador números aleatorios
//Este programa generará un número aleatorio de números aleatorios. Al final mostrará en cada
//ejecución cuantos ha generado y los mostrará.

package boletin;
import java.util.Random;
public class ED1T1P {
	static Random rnd=new Random();
	public static void main(String[] args) {
		int veces;
		int contador=0;
		veces = rnd.nextInt(100)+1;
		for(int i = 0; i<veces;i++) {
			System.out.println(rnd.nextInt(50));
			contador++;
		}
		System.out.println("Se han generado "+contador+" números aleatorios");
	}
}

// Ponemos un breakpoint en la línea 13 para parar la ejecución en el bucle.
// Nos muestra la variables arg, veces, contador e i.
// Obervamos que el problema es que cada vuelta del bucle se reinicia el contador a 0
// así que el resultado final siempre será 1.
// Solución: quitar la línea 14 (contador = 0).