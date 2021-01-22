package util;

import org.antlr.runtime.Token;

public class AttributoVariabile {
	final String nome;
	final Variabile variabile;
	boolean not;
	
	
	public AttributoVariabile(String nome, Variabile variabile, Token tk) {
		super();
		this.nome = nome;
		this.variabile = variabile;
		this.not = tk == null ? false : true;
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


	public Variabile getVariabile() {
		return variabile;
	}


	public boolean isNot() {
		return not;
	}


	public void setNot(boolean not) {
		this.not = not;
	}
	
	
	
}

