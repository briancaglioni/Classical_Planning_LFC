package util;


public class AttributoVariabile {
	final String nome;
	final String variabile;
	
	
	public AttributoVariabile(String name, String variabile) {
		super();
		this.nome = name;
		this.variabile = variabile;
	}


	public String getNome() {
		return nome;
	}


	public String getOggetto() {
		return variabile;
	}

	public boolean equals(Object attr) {
		
		return this.nome.equals(((Attributo) attr).getNome()) && 
				this.variabile.equals(((Attributo) attr).getOggetto());
	}
	
	@Override
	public String toString() {
		return this.nome +"("+ this.variabile +")";
	}
	
	
	
}

