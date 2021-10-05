import java.util.Scanner;
class Vocales{
	public int cantidadVocales(String cadena, int len) {
		if(len == cadena.length()) {
			//fin
			return 0;
		}else {
			if (cadena.charAt(len) == 'a') {
				return 1 + cantidadVocales(cadena, len+1);
			}else if (cadena.charAt(len) == 'e') {
				return 1 + cantidadVocales(cadena, len+1);
			} else if (cadena.charAt(len) == 'i') {
				return 1 + cantidadVocales(cadena, len+1);
			} else if (cadena.charAt(len) == 'o') {
				return 1 + cantidadVocales(cadena, len+1);
			} else if (cadena.charAt(len) == 'u') {
				return 1 + cantidadVocales(cadena, len+1);
			} else {
			return 0 + cantidadVocales(cadena, len + 1);
			}
		}
	}
}
public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa que calcule a cantidad de vocales en una cadena");
		System.out.println("Introduce cadena: ");
		String cadena = entrada.nextLine().toLowerCase();
		
		Vocales v = new Vocales();
		
		System.out.println("Cantidad de vocales: " + v.cantidadVocales(cadena, 0));
		
	}
}
