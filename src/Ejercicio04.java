import java.util.Scanner;

class DivisoresEnteros{
	public int divisoresEnteros(int a, int b) {
		if(b>=a) {
			return 0;
		} else {
			if((a%b)==0) {
				return 1 + divisoresEnteros(a, b+1);
			}else {
				return 0 + divisoresEnteros(a, b+1);
			}
		}
	}
}

public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa que muestre cuantos son los divisores enteros entre dos números dados");
		System.out.println("Introduce primer numero: ");
		int a = entrada.nextInt();
		System.out.println("Introduce segundo numero: ");
		int b = entrada.nextInt();
		DivisoresEnteros de = new DivisoresEnteros();
		System.out.println("Cantidad de divisores enteros: " + de.divisoresEnteros(a, b));
	}
}
