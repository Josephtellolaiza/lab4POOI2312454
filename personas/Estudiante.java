package personas;

public class Estudiante {
	private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private float calificacion;

    // Constructor
    public Estudiante(int id, String nombre, String apellido, int edad, String curso, float calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Método para obtener la calificación del estudiante
    public float getCalificacion() {
        return calificacion;
    }

    // Método para obtener el curso del estudiante
    public String getCurso() {
        return curso;
    }

    // Getters y setters para los demás atributos (id, nombre, apellido, edad)
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Setter para la calificación
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

}
