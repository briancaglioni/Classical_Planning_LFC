package util;

import java.util.ArrayList;

public class Azione {
	
	final private String nome;
	private ArrayList<Variabile> listaVariabili;
	public Azione(String nome) {
		super();
		this.nome = nome;
		this.listaVariabili = new ArrayList<Variabile>();
	}
	public ArrayList<Variabile> getListaVariabili() {
		return listaVariabili;
	}
	public void setListaVariabili(ArrayList<Variabile> listaVariabili) {
		this.listaVariabili = listaVariabili;
	}
	public String getNome() {
		return nome;
	}
	
	public void addVariabile(String var) {
		listaVariabili.add(new Variabile(var));
	}
	
	@Override
	public String toString() {
		return this.nome + " " + listaVariabili.toString();
	}

	
}
