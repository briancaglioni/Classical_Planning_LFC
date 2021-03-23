package util;

import java.util.ArrayList;

/**
 * Effetti di un operatore specificati da una lista di AttributiVariabili.
 */
public class Effetti {
	ArrayList<AttributoVariabile> effetti;

	/**
	 * Costruttore. Inizialmente la lista degli effetti è vuota.
	 */
	public Effetti() {
		effetti = new ArrayList<>();
	}

	/**
	 * Metodo per aggiungere un AttributoVariabile alla lista effetti.
	 * 
	 * @param attrVar
	 */
	public void addAttrVariabile(AttributoVariabile attrVar) {
		effetti.add(attrVar);
	}

	/**
	 * Override del metodo toString
	 */
	@Override
	public String toString() {
		return "Effetti [effetti=" + effetti + "]";
	}

	// Getters.
	
	public ArrayList<AttributoVariabile> getEffetti() {
		return effetti;
	}

	// Setters.

	public void setEffetti(ArrayList<AttributoVariabile> effetti) {
		this.effetti = effetti;
	}

}
