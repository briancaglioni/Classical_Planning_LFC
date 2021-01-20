package util;

public class Costo {
	float valore;
	
	@Override
	public String toString() {
		return "Costo:" + valore;
	}

	public Costo(String valore) {
		super();
		this.valore = Float.parseFloat(valore);
	}

	public float getValore() {
		return valore;
	}

	public void setValore(float valore) {
		this.valore = valore;
	}

	
	
	
}
