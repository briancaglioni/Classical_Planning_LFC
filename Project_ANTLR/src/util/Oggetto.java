package util;

public class Oggetto {
	private String nome;

	@Override
	public String toString() {
		return "Oggetto [oggetto=" + nome + "]";
	}

	public Oggetto(String nome) {
		super();
		this.nome = nome;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object oggetto) {
		return this.nome.equals(((Oggetto) oggetto).getNome()); 
	}
	
	
	
}
