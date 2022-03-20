//3. Tercer programa: contador de número pares e impares
//El programa muestra par o impar, unas 100 veces dependiendo del valor de la variable “i” del
//bucle while. El bucle es infinito. ¿Cómo resolverlo? ¿Qué le ocurre a la variable “i”?

package boletin;
public class ED1T3P {
	public static void main(String[] args) {
		int i;
		i = 0;
		while(i<100) {
			if(i%2==0) {
				System.out.println("Par");
				i++;
			} else {
				System.out.println("Impar");
				i--;
			}
		}
	}
}
