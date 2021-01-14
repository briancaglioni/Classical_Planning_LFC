package util;

public class Oggetto {
	private String oggetto;

	@Override
	public String toString() {
		return "Oggetto [oggetto=" + oggetto + "]";
	}

	public Oggetto(String oggetto) {
		super();
		this.oggetto = oggetto;
	}

	public String getOggetto() {
		return oggetto;
	}

	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}
	
	
}
