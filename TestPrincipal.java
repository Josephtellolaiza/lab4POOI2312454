import figuras.Circulo;
import figuras.Rectangulo;

public class TestPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo = new Circulo("circulo1", 2.0, "rojo");
		circulo.setColor("Azul");
		circulo.setName("Circulito");
		circulo.setRadio(5.0);
		
		System.out.println(circulo.getColor());
		System.out.println(circulo.getName());
		System.out.println(circulo.getRadio());
		
		Rectangulo rectangulo = new Rectangulo(1.0f, 1.0f);
		
	}

}
