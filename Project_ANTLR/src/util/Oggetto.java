package util;

/**
 * Oggetto specificato da un nome.
 */
public class Oggetto {
	private String nome;

	/**
	 * Costruttore specificando il nome dell'oggetto.
	 * 
	 * @param nome
	 */
	public Oggetto(String nome) {
		super();
		this.nome = nome;
	}

	/**
	 * Override del metodo equals
	 * 
	 * @param oggetto
	 */
	@Override
	public boolean equals(Object oggetto) {
		return this.nome.equals(((Oggetto) oggetto).getNome());
	}

	/**
	 * Override del metodo toString.
	 */
	@Override
	public String toString() {
		return "Oggetto [oggetto=" + nome + "]";
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
