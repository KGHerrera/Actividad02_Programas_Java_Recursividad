import java.util.Scanner;

class Divisores{
	public void mostrarDivisoresNumero(int numero, int n) {
		n+=1;
		if(n >= numero) {
			System.out.println("Fin del programa");
		} else {
			if (numero%n == 0) {
				System.out.println(n);
			}
			try {
				mostrarDivisoresNumero(numero, n);
			} catch (StackOverflowError e) {
				//Numero muy grande
			}
			
		}
	}
	
}
public class Ejercicio01 {
	public static void main(String[] args) {
		System.out.println("Programa que muestre los DIVISORES de un numero dado");
		Scanner entrada = new Scanner(System.in);
		Divisores d1 = new Divisores();
		System.out.println("Introduce numero: ");
		int numero = entrada.nextInt();
		System.out.println("Divisores del numero: ");
		d1.mostrarDivisoresNumero(numero, 1);
	}
}
