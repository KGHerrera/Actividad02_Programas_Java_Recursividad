import java.util.Scanner;

class CadenaInversa{
	public String cadenaInversa(String cadena, int lenCadena) {
		if(lenCadena<0) {
			return "";
		}else {
			return cadena.charAt(lenCadena)+"" + cadenaInversa(cadena, lenCadena-1); 
		}
	}
}

public class Ejercicio07 {
	public static void main(String[] args) {
		System.out.println("Programa que muestre una cadena en forma inversa");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce cadena: ");
		String cadena = entrada.nextLine();
		
		CadenaInversa ci = new CadenaInversa();
		System.out.println("Cadena inversa: ");
		System.out.println(ci.cadenaInversa(cadena, cadena.length()-1));
	}
}
