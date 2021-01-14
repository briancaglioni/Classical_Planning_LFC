package util;

import java.util.ArrayList;

public class Operatore extends Symbol{
	
	private static int last_id = 0;
	private int id;
	private Azione azione;
	private Precondizioni precondizioni;
	private Effetti effetti;
	private Costo costo;
	

	
	public Operatore(Azione azione, Precondizioni precondizioni, Effetti effetti, Costo costo) {
		super();
		this.id = last_id++;
		this.azione = azione;
		this.precondizioni = precondizioni;
		this.effetti = effetti;
		this.costo = costo;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Operatore [id=" + id + ", azione=" + azione + ", precondizioni=" + precondizioni + ", effetti="
				+ effetti + ", costo=" + costo + "]";
	}




	public static int getLast_id() {
		return last_id;
	}



	public static void setLast_id(int last_id) {
		Operatore.last_id = last_id;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Azione getAzione() {
		return azione;
	}



	public void setAzione(Azione azione) {
		this.azione = azione;
	}



	public Precondizioni getPrecondizioni() {
		return precondizioni;
	}



	public void setPrecondizioni(Precondizioni precondizioni) {
		this.precondizioni = precondizioni;
	}



	public Effetti getEffetti() {
		return effetti;
	}



	public void setEffetti(Effetti effetti) {
		this.effetti = effetti;
	}



	public Costo getCosto() {
		return costo;
	}



	public void setCosto(Costo costo) {
		this.costo = costo;
	}



	@Override
	public boolean equals(Object operatore) {
		return this.id == ((Operatore) operatore).getId();
	}
	

	
	
	
}
