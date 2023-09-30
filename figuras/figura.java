package figuras;

public class figura {
	private String tipo;
	
	public figura(String tipo) {
		this tipo = tipo;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getArea() {
		return 0.0;
	}
	
	public boolean isRegular() {
		return false;
	}
	
}
