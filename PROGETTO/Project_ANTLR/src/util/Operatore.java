package util;

import java.util.ArrayList;

/**
 * Operatore definito da un attributo statico per la classe, un id che lo
 * identifica univocamente, un'azione, una lista di precondizioni, una lista di
 * effetti, un costo.
 */
public class Operatore extends Symbol {

	private static int last_id = 0;
	private int id;
	private Azione azione;
	private Precondizioni precondizioni;
	private Effetti effetti;
	private Costo costo;

	/**
	 * Costruttore vuoto.
	 */
	public Operatore() {
	}

	/**
	 * Costruttore specificando azione, precondizioni, effetti, costo. Il last_id
	 * viene incrementato ad ogni chiamata del costruttore.
	 * 
	 * @param azione
	 * @param precondizioni
	 * @param effetti
	 * @param costo
	 */
	public Operatore(Azione azione, Precondizioni precondizioni, Effetti effetti, Costo costo) {
		super();
		this.id = last_id++;
		this.azione = azione;
		this.precondizioni = precondizioni;
		this.effetti = effetti;
		this.costo = costo;
	}
	
	/**
	 * Override del metodo equals.
	 * @param operatore
	 */
	@Override
	public boolean equals(Object operatore) {
		return this.id == ((Operatore) operatore).getId();
	}

	/**
	 * Override del metodo toString.
	 */
	@Override
	public String toString() {
		return "Operatore [id=" + id + ", azione=" + azione + ", precondizioni=" + precondizioni + ", effetti="
				+ effetti + ", costo=" + costo + "]";
	}

	// Getters.

	public static int getLast_id() {
		return last_id;
	}

	public int getId() {
		return id;
	}

	public Azione getAzione() {
		return azione;
	}

	public Precondizioni getPrecondizioni() {
		return precondizioni;

	}

	public Effetti getEffetti() {
		return effetti;
	}

	public Costo getCosto() {
		return costo;
	}

	// Setters.

	public void setId(int id) {
		this.id = id;
	}

	public static void setLast_id(int last_id) {
		Operatore.last_id = last_id;
	}

	public void setAzione(Azione azione) {
		this.azione = azione;
	}

	public void setPrecondizioni(Precondizioni precondizioni) {
		this.precondizioni = precondizioni;
	}

	public void setEffetti(Effetti effetti) {
		this.effetti = effetti;
	}

	public void setCosto(Costo costo) {
		this.costo = costo;
	}

}
