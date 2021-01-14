package util;

public class Costo {
	float costo;
	
	@Override
	public String toString() {
		return "Costo:" + costo;
	}

	public Costo(String costo) {
		super();
		this.costo = Float.parseFloat(costo);
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}
	
	
}
