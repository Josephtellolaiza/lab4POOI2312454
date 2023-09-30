import Animales.Perro;
import figuras.Circulo;
import figuras.Punto;
import figuras.Rectangulo;
import otros.Automovil;
import otros.Celular;
import otros.Mesa;
import otros.Pelota;
import personas.Empleado;
import personas.Estudiante;

public class TestPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Este es del circulo");

		Circulo circulo = new Circulo("circulo1", 2.0, "rojo");
		circulo.setColor("Azul");
		circulo.setName("Circulito");
		circulo.setRadio(5.0);
		
		System.out.println(circulo.getColor());
		System.out.println(circulo.getName());
		System.out.println(circulo.getRadio());
		
System.out.println("Este es del Rectangulo");

		Rectangulo rectangulo = new Rectangulo();
		rectangulo.setAncho(2.0f);
		rectangulo.setLargo(3.0f);
		
		System.out.println(rectangulo.getAncho());
		System.out.println(rectangulo.getLargo());
		System.out.println(rectangulo.getArea());
		
System.out.println("Este es del Punto");
   
        Punto punto = new Punto(1, 1);
        punto.setCoordenadaX(2);
        punto.setCoordenadaY(2);
        
        System.out.println(punto.getCoordenadaX());
        System.out.println(punto.getCoordenadaY());
        
System.out.println("Este es del Triangulo");
// profesora disculpe es que no entendi como sacar del triangulo
System.out.println("Este es del Empleado");

        Empleado empleado = new Empleado(111, "Joseph", "Tello", 3000);
        empleado.setNombre("Daniel");
        empleado.setApellido("Laiza");
        empleado.setSalario(5000);
  
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getApellido());
        System.out.println(empleado.getSalario());
        System.out.println(empleado.getSalario());
        System.out.println(empleado.getSalarioAnual());
        
System.out.println("Este es de la Pelota");
  
        Pelota pelota = new Pelota(2.0f, "rojo");
        pelota.setTamaño(3.0f);
        pelota.setColor("Azul");
        
        System.out.println(pelota.getTamaño());
        System.out.println(pelota.getColor());
        
System.out.println("Este es del Perro");

        Perro perro = new Perro("Fido", "Chihuahua", "Marron", 4);
        perro.setNombre("Oddie");
        perro.setRaza("Chihuahua cruzado");
        perro.setEdad(5);
        
        System.out.println(perro.getNombre());
        System.out.println(perro.getRaza());
        System.out.println(perro.getEdad());
        
System.out.println("Este es del Automovil");

        Automovil automovil = new Automovil("AWF-459", "Toyota", "2017", "Negro", "0 Kilometros");
        automovil.setPlaca("AWF-459");
        automovil.setMarca("Hyundai");
        automovil.setModelo("2023");
        automovil.setColor("Negro");
        automovil.setTipo("0 kilometros");
        
        System.out.println(automovil.getPlaca());
        System.out.println(automovil.getMarca());
        System.out.println(automovil.getModelo());
        System.out.println(automovil.getColor());
        System.out.println(automovil.getTipo());
        
System.out.println("Este es de la mesa");

        Mesa mesa = new Mesa(80, 30, "Marron", "Madera", "Cuadrada");
        mesa.setMaterial("Cristal");
        mesa.setForma("Rectangular");
        
        System.out.println(mesa.getMaterial());
        System.out.println(mesa.getForma());
        
System.out.println("Este es del Estudiante");
         
        Estudiante estudiante = new Estudiante(2312454, "Joseph", "Tello", 16, "Programacion", 20);
        estudiante.setNombre("Daniel");
        estudiante.setApellido("Laiza");
        estudiante.setEdad(17);
        estudiante.setCalificacion(13);
        
        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getApellido());
        System.out.println(estudiante.getEdad());
        System.out.println(estudiante.getCalificacion());
        
System.out.println("Este es del Celular");  
       Celular celular = new Celular(977394307, "Samsung", "Azul", "A10", "Basico");
       celular.setNumero(977394307);
       celular.setMarca("Xiomi");
       celular.setModelo("Poco x3 pro");
       celular.setPlan("Basico");
       
       System.out.println(celular.getNumero());
       System.out.println(celular.getMarca());
       System.out.println(celular.getModelo());
       System.out.println(celular.getPlan());
	}

}
