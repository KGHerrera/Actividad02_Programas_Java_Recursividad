import java.util.Scanner;

class Cosientes{
	public int mostrarCocientesEnteros(int a, int b) {
		if(a < b) {
			return 0;
		} else{
			return 1 + mostrarCocientesEnteros(a-b, b);
		}
		
	}
}

public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa que muestre los cocientes enteros de la division entre entre dos números dados");
		int a = 0,b = 0;
		do {
			System.out.println("Ingresa dividendo: ");
			a = entrada.nextInt();
			System.out.println("Introduce divisor: ");
			b = entrada.nextInt();
		} while(a < 0 || b < 0);
		
		Cosientes c1 = new Cosientes();
		
		System.out.println("El cociente es: " + c1.mostrarCocientesEnteros(a, b));
		
	}
}
