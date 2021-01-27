package util;

import org.antlr.runtime.Token;

/**
 * Attributo. Composto da un nome, da una variabile e un attributo che indica se
 * è l'attributo è negato.
 *
 */
public class AttributoVariabile {
	final String nome;
	final Variabile variabile;
	boolean not;

	/**
	 * Costruttore specificando il nome dell'attributo, una variabile e un token che
	 * indica il valore del parametro not.
	 * 
	 * @param nome
	 * @param variabile
	 * @param tk
	 */
	public AttributoVariabile(String nome, Variabile variabile, Token tk) {
		super();
		this.nome = nome;
		this.variabile = variabile;
		this.not = tk == null ? false : true;
	}

	/**
	 * Override del metodo equals.
	 * 
	 * @param attr
	 */
	@Override
	public boolean equals(Object attr) {
		if (!(attr instanceof AttributoVariabile))
			return false;
		return this.nome.equals(((AttributoVariabile) attr).getNome())
				&& this.variabile.equals(((AttributoVariabile) attr).getVariabile())
				&& this.not == (((AttributoVariabile) attr).isNot());
	}

	/**
	 * Override del metodo toString.
	 */
	@Override
	public String toString() {
		return this.nome + "(" + this.variabile + ")";
	}

	// Getters.

	public String getNome() {
		return nome;
	}

	public Variabile getVariabile() {
		return variabile;
	}

	public boolean isNot() {
		return not;
	}

	// Setters.

	public void setNot(boolean not) {
		this.not = not;
	}

}
