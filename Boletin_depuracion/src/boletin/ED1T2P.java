//2. Segundo programa: funci�n m�gica
//El programa lee un n�mero por teclado y luego realiza una operaci�n m�gica para devolver un
//resultado para mostrarlo por pantalla. El resultado esperado es �1�.

package boletin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ED1T2P {
	public static void main(String[] args) throws IOException {
		int numero;
		double resultado;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un n�mero:");
		numero= Integer.parseInt(lectura.readLine());
		resultado = funcionMagica(numero);
		System.out.println("El resultado obtenido es "+ resultado);

	}
	public static double funcionMagica(int a) {
		double r;
		r = a/(((((((a*2.0)*5.0)*3.0)/2.0)/5.0)/3.0)-a);
		return r;
	}
}