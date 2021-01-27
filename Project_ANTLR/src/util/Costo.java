package util;

/**
 * Costo specificato dal suo valore.
 */
public class Costo {
	float valore;

	/**
	 * Costruttore specificando il valore del costo.
	 * 
	 * @param valore
	 */
	public Costo(String valore) {
		super();
		this.valore = Float.parseFloat(valore);
	}

	/**
	 * Override del metodo toString.
	 */
	@Override
	public String toString() {
		return "Costo:" + valore;
	}

	// Getters.

	public float getValore() {
		return valore;
	}

	// Setters.

	public void setValore(float valore) {
		this.valore = valore;
	}

}
