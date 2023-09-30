package otros;

public class Mesa {
	private float ancho;
    private float altura;
    private String color;
    private String material;
    private String forma;
    // Constructor
    public Mesa(float ancho, float altura, String color, String material, String forma) {
        this.ancho = ancho;
        this.altura = altura;
        this.color = color;
        this.material = material;
        this.forma = forma;
    }
    // Métodos para obtener el material
    public String getMaterial() {
        return material;
    }
 // Métodos para obtener la forma
    public String getForma() {
        return forma;
    }
    // Métodos para establecer el material y la forma
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
    

}
