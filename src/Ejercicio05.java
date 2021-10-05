import java.util.Scanner;

class Binario{
	 public void convertirDecimal(int numero) {
	        if (numero < 2) {
	            System.out.print(numero);
	        } else {
	            convertirDecimal(numero / 2);
	            System.out.print(numero % 2);
	        }
	    }
}
public class Ejercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa que muestre la conversión de un numero decimal a su representación en sistema binario.");
		System.out.println("Introduce numero: ");
		int numero = entrada.nextInt();
		
		Binario b = new Binario();
		
		System.out.println("Numero binario: ");
		b.convertirDecimal(numero);
	}
}
