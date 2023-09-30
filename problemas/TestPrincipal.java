package problemas;

import java.util.Random;

public class TestPrincipal {

	public static void main(String[] args) {

		Random valorRandom = new Random();
		//Random escoge de manera aleatoria 
		
		int valor1 = valorRandom.nextInt(6)+1; //0, 1, 2, 3, 4, 5
		// valor1 = 0 , en el caso que random le toque valer 0
		// se le sumara 1 si en caso salga 0, saldra 1.
		
		int valor2 = valorRandom.nextInt(6)+1;
		
		
		System.out.println("Valor aleatorio 1 es: " + valor1);
		System.out.println("Valor aleatorio 2 es: "+ valor2);
		System.out.println(valor1 + valor2);
		System.out.println(valor1 - valor2);
		System.out.println(valor1 * valor2);
		System.out.println(valor1 / valor2);
		
		
		
		
		
		
	}

}
