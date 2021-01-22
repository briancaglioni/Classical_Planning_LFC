package util;

public class Variabile {
	private String nome;
	

	public Variabile(String nome) {
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
	public String toString() {
		return nome;
	}
	
	@Override
	public boolean equals(Object var) {
		return this.nome.equals(((Variabile) var).getNome());
	}
	
}
