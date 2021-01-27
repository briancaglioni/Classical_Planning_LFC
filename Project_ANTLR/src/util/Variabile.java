package util;

/**
 * Variabile specificata da un nome.
 */
public class Variabile {
	private String nome;

	/**
	 * Costruttore specificando il nome della variabile.
	 * 
	 * @param nome
	 */
	public Variabile(String nome) {
		super();
		this.nome = nome;
	}

	/**
	 * Override del metodo equals.
	 * 
	 * @param var
	 */
	@Override
	public boolean equals(Object var) {
		return this.nome.equals(((Variabile) var).getNome());
	}

	/**
	 * Override del metodo toString.
	 */
	@Override
	public String toString() {
		return nome;
	}

	/**
	 * Overdride del metodo hasCode.
	 */
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	// Getters.

	public String getNome() {
		return nome;
	}

	// Setters.

	public void setNome(String nome) {
		this.nome = nome;
	}

}
