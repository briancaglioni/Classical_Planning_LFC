package util;

import java.util.ArrayList;

/**
 * Precondizioni di un operatore specificati da una lista di AttributiVariabili.
 */
public class Precondizioni {
	private ArrayList<AttributoVariabile> precond;

	/**
	 * Costruttore. Inizialmente la lista degli effetti è vuota.
	 */
	public Precondizioni() {
		precond = new ArrayList<>();
	}

	/**
	 * Metodo per aggiungere un AttributoVariabile alla lista effetti.
	 * 
	 * @param attrVar
	 */
	public void addAttrVariabile(AttributoVariabile attrVar) {
		precond.add(attrVar);
	}

	/**
	 * Override del metodo toString.
	 */
	@Override
	public String toString() {
		return "Precondizioni [precond=" + precond + "]";
	}

	// Getters.

	public ArrayList<AttributoVariabile> getPrecond() {
		return precond;
	}

	// Setters.

	public void setPrecond(ArrayList<AttributoVariabile> precond) {
		this.precond = precond;
	}

}
