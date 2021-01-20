package util;

import java.util.ArrayList;

public class Stato extends Symbol{
	
	final private String nome;
	private ArrayList<Attributo> listaAttributi;

	public Stato(String nome) {
		this.nome = nome;
		this.listaAttributi = new ArrayList<>();
	};
	
	public Stato(String nome,  ArrayList<Attributo> listaAttributi ) {
		this.nome = nome;
		this.listaAttributi = new ArrayList<Attributo>();
		for (Attributo a : listaAttributi) {
			this.listaAttributi.add(new Attributo(a.getNome(), new Oggetto(a.getOggetto().getNome())));
		}
		
	};
	
	public void setListaAttributi(ArrayList<Attributo> listaAttributi) {
		this.listaAttributi = listaAttributi;
	}

	@Override
	public String toString() {
		return this.nome + " "  +this.listaAttributi.toString();
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Attributo> getListaAttributi() {
		return listaAttributi;
	}
	
	@Override
	public boolean equals(Object stato) {
		if(stato instanceof Operatore) return false;
		return this.nome.equals(((Stato) stato).getNome());
	}
	
	public void addAttributo(Attributo a) {
		listaAttributi.add(a);
	}
}


