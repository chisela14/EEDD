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
			} else {
				System.out.println("Impar");
			}
			i++;
		}
	}
}
//Ponemos un breakpoint en la línea 10 para parar en el bucle.
//Vemos que la variable i va variando entre 1 y 0 indefinidamente porque cuando vale 0
//va al condicional que le suma 1 y cuando vale uno va al else que le resta uno,
//así que nunca va a valer más de 100 y detenerse el bucle.
//Solución: sacar la línea 13 (i++;) para ponerla despúes del else y eliminar la 
//línea 16 (i--;)