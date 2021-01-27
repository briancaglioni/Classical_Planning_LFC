package util;

/**
 * Attributo. Composto da un nome e da un oggetto a cui si riferisce
 * l'attributo.
 *
 */
public class Attributo {
	final String nome;
	final Oggetto oggetto;

	/**
	 * Costruttore specificando il nome dell'attributo e dell'oggetto a cui si
	 * riferisce.
	 * 
	 * @param name
	 * @param oggetto
	 */
	public Attributo(String name, Oggetto oggetto) {
		super();
		this.nome = name;
		this.oggetto = oggetto;
	}

	/**
	 * Override del metodo equals
	 * 
	 * @param attr
	 */
	@Override
	public boolean equals(Object attr) {
		return this.nome.equals(((Attributo) attr).getNome()) && this.oggetto.equals(((Attributo) attr).getOggetto());
	}

	/**
	 * Override del metodo toString.
	 */
	@Override
	public String toString() {
		return this.nome + "(" + this.oggetto + ")";
	}

	// Getters.

	public String getNome() {
		return nome;
	}

	public Oggetto getOggetto() {
		return oggetto;
	}

	// Setters.

}
