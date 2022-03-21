//2. Segundo programa: función mágica
//El programa lee un número por teclado y luego realiza una operación mágica para devolver un
//resultado para mostrarlo por pantalla. El resultado esperado es “1”.

package boletin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ED1T2P {
	public static void main(String[] args) throws IOException {
		int numero;
		double resultado;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un número:");
		numero= Integer.parseInt(lectura.readLine());
		resultado = funcionMagica(numero);
		System.out.println("El resultado obtenido es "+ resultado);

	}
	public static double funcionMagica(int a) {
		double r;
		r = (((((((a*2.0)*5.0)*3.0)/2.0)/5.0)/3.0)-a)+1;
		return r;
	}
}
//Breakpoint en la línea 16.
//Si introducimos la operación de la función mágica por partes como expresiones al
//final veremos que la operación en paréntesis grande da cero y dividir por cero da error.
//Solución: quitar la división y sumar uno.