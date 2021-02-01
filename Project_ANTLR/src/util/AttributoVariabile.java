package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.antlr.runtime.Token;

/**
 * Attributo. Composto da un nome, da una variabile e un attributo che indica se
 * è l'attributo è negato.
 *
 */
public class AttributoVariabile {
	final String nome;
	final ArrayList<Variabile> listaVariabili;
	boolean not;

	/**
	 * Costruttore specificando il nome dell'attributo, una variabile e un token che
	 * indica il valore del parametro not.
	 * 
	 * @param nome
	 * @param variabile
	 * @param tk
	 */
	public AttributoVariabile(String nome, Token tk) {
		super();
		this.nome = nome;
		this.listaVariabili = new ArrayList<Variabile>();
		this.not = tk == null ? false : true;
	}
	
	public void addVariabile(String v) {
		this.listaVariabili.add(new Variabile(v));
	}

	/**
	 * Override del metodo equals.
	 * 
	 * @param attr
	 */
	@Override
	public boolean equals(Object att) {
		if(! (att instanceof AttributoVariabile)) return false;
		if(this == att) return true;
		AttributoVariabile attr = (AttributoVariabile) att;
		//------->> Riguardare il controllo sul NOT per Errori / Warnings <<-----
		return this.nome.equals(attr.getNome()) && listEqualsIgnoreOrder(attr.getListaVariabili(), this.listaVariabili) && this.isNot() == ((AttributoVariabile) att).isNot();
	}
	
	public static <T> boolean listEqualsIgnoreOrder(List<T> list1, List<T> list2) {
	    return new HashSet<>(list1).equals(new HashSet<>(list2));
	}
	@Override
	public String toString() {
		return this.nome  +": " + this.listaVariabili;
	}
	
	@Override
	public int hashCode() {
		return this.listaVariabili.hashCode() + this.nome.hashCode() + Boolean.hashCode(this.isNot());
	}

	// Getters.

	public String getNome() {
		return nome;
	}

	public ArrayList<Variabile> getListaVariabili() {
		return listaVariabili;
	}

	public boolean isNot() {
		return not;
	}

	// Setters.

	public void setNot(boolean not) {
		this.not = not;
	}

}
