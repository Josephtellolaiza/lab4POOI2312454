package otros;

public class Pelota {
	private float tamaño;
    private String color;
    
    // Constructor
    public Pelota(float tamaño, String color) {
        this.tamaño = tamaño;
        this.color = color;
    }
    
    // Método para obtener el tamaño de la pelota
    public float getTamaño() {
        return tamaño;
    }
    
    // Método para obtener el color de la pelota
    public String getColor() {
        return color;
    }
    
    // Método para establecer el tamaño de la pelota
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    
    // Método para establecer el color de la pelota
    public void setColor(String color) {
        this.color = color;
    }
    

}
