package util;

import java.util.ArrayList;

public class Operatore extends Symbol{
	
	static int last_id = 0;
	private int id;
	private Azione azione;
	private ArrayList<AttributoVariabile> precondizioni;
	private ArrayList<AttributoVariabile> effetti;
	private float costo;
	
	public Operatore() {
		this.id = last_id++;
		this.precondizioni = new ArrayList<>();
		this.effetti = new ArrayList<>();
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getLast_id() {
		return last_id;
	}

	public static void setLast_id(int last_id) {
		Operatore.last_id = last_id;
	}

	public Azione getAzione() {
		return azione;
	}

	public void setAzione(Azione azione) {
		this.azione = azione;
	}

	public ArrayList<AttributoVariabile> getPrecondizioni() {
		return precondizioni;
	}

	public void setPrecondizioni(ArrayList<AttributoVariabile> precondizioni) {
		this.precondizioni = precondizioni;
	}

	public ArrayList<AttributoVariabile> getEffetti() {
		return effetti;
	}

	public void setEffetti(ArrayList<AttributoVariabile> effetti) {
		this.effetti = effetti;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}
	
	@Override
	public boolean equals(Object operatore) {
		return this.id == ((Operatore) operatore).getId();
	}
	
	@Override
	public String toString() {
		return "{" + "azione: " + this.azione 
				+", precondizioni: "+ this.precondizioni
				+ ", effetti: " + this.effetti 
				+ ", costo: " + String.valueOf(this.costo) 
				+"}";
	}
	
	
	
}
