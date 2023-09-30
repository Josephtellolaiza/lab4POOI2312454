package figuras;

public class Rectangulo {
	 private float largo;
	 private float ancho;

	    // Constructor
	    public Rectangulo() {
	        this.largo = 1.0f;
	        this.ancho = 1.0f;
	    }

	    // Método para obtener el largo
	    public float getLargo() {
	        return largo;
	    }

	    // Método para obtener el ancho
	    public float getAncho() {
	        return ancho;
	    }

	    // Método para obtener el área
	    public float getArea() {
	        return largo * ancho;
	    }

		/**
		 * @param largo the largo to set
		 */
		public void setLargo(float largo) {
			this.largo = largo;
		}

		/**
		 * @param ancho the ancho to set
		 */
		public void setAncho(float ancho) {
			this.ancho = ancho;
		}
	    
	    

}
