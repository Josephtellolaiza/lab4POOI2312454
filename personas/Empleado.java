package personas;

public class Empleado {
	// Atributos
	
    private int id;
    private String nombre;
    private String apellido;
    private int salario;

    // Constructor
    public Empleado(int id, String nombre, String apellido, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    // Método para obtener el salario
    public int getSalario() {
        return salario;
    }

    // Método para obtener el salario anual
    public int getSalarioAnual() {
        return salario * 12;
    }

    // Método para establecer el salario
    public void setSalario(int salario) {
        this.salario = salario;
    }

    // Métodos para obtener y establecer el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para obtener y establecer el apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Método para obtener el ID del empleado
    public int getId() {
        return id;
    }

    // Método toString para representar el objeto como cadena
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + "]";
    }

}
