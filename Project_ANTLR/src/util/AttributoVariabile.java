package util;


public class AttributoVariabile {
	final String nome;
	final String variabile;
	
	
	public AttributoVariabile(String nome, String variabile) {
		super();
		this.nome = nome;
		this.variabile = variabile;
	}


	public String getNome() {
		return nome;
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

