package otros;
public class Celular {
	private int numero;
	private String marca;
	private String color;
	private String modelo;
	private String plan;
	
	public Celular(int numero, String marca, String color, String modelo, String plan) {
		super();
		this.numero = numero;
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.plan = plan;
	}
	// Método para obtener el modelo del celular
    public String getModelo() {
        return modelo;
    }

    // Método para obtener la marca del celular
    public String getMarca() {
        return marca;
    }
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the plan
	 */
	public String getPlan() {
		return plan;
	}
	/**
	 * @param plan the plan to set
	 */
	public void setPlan(String plan) {
		this.plan = plan;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

    
    
}
