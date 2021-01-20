package util;

public class Attributo {
	final String nome;
	final Oggetto oggetto;
	
	
	public Attributo(String name, Oggetto oggetto) {
		super();
		this.nome = name;
		this.oggetto = oggetto;
	}


	public String getNome() {
		return nome;
	}


	public Oggetto getOggetto() {
		return oggetto;
	}

	public boolean equals(Object attr) {
		
		return this.nome.equals(((Attributo) attr).getNome()) && 
				this.oggetto.equals(((Attributo) attr).getOggetto());
	}
	
	@Override
	public String toString() {
		return this.nome +"("+ this.oggetto +")";
	}
	
	
	
}
