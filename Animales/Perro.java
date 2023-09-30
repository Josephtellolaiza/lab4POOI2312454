package Animales;

public class Perro {
	 private String nombre;
	    private String raza;
	    private String color;
	    private int edad;

	    // Constructor
	    public Perro() {
	        // Constructor por defecto
	    }

	    // Constructor con parámetros
	    public Perro(String nombre, String raza, String color, int edad) {
	        this.nombre = nombre;
	        this.raza = raza;
	        this.color = color;
	        this.edad = edad;
	    }

	    // Método para obtener el tipo de raza
	    public String getTipoRaza() {
	        return raza;
	    }

	    // Método para obtener la edad
	    public int getEdad() {
	        return edad;
	    }

	    // Métodos para establecer valores
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setRaza(String raza) {
	        this.raza = raza;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }


}
