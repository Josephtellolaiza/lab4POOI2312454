package problemas;
import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
	int dias;
	int ventas;
	int ventastotales=0;
	
	try {
		System.out.println("Ingrese el numero de dias que cuente con cifras de ventas: ");
		
		Scanner teclado = new Scanner(System.in);
		dias = teclado.nextInt();
		
		for( int contador=1; contador<= dias; contador++) {
			System.out.println("Ingrese las ventas para el dia "+ contador+" : ");
			ventas = teclado.nextInt();
			ventastotales= ventastotales + ventas;
		}
		
		System.out.println("Las ventas totales son : "+ ventastotales);
		
	}catch(Exception e) {
		System.out.println("Error, ingrese un numero.");
	}
}
}