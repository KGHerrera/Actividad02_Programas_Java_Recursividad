import java.util.Scanner;

class Factorial{
	
	public int factorial(int numero) {
		if (numero==0) return 1;
		else return numero*factorial(numero-1);
	}
}
public class Ejercicio02 {
	public static void main(String[] args) {
		System.out.println("Programa que muestre el FACTORIAL de un numero dado");
		Scanner entrada = new Scanner(System.in);
		Factorial f1 = new Factorial();
		System.out.println("Introduce numero: ");
		int numero = entrada.nextInt();
	
		System.out.println("Factorial del numero: ");
		System.out.println(f1.factorial(numero));
	}
}
