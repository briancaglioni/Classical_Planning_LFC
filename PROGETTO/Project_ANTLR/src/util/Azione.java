package util;

import java.util.ArrayList;

/**
 * Azione specificata da un nome e da una lista di variabili necessarie per la
 * sua applicazione.
 *
 */
public class Azione {

	final private String nome;
	private ArrayList<Variabile> listaVariabili;

	/**
	 * Costruttore specificando il nome dell'azione. La lista delle variabili è
	 * inizialmente vuota.
	 * 
	 * @param nome
	 */
	public Azione(String nome) {
		super();
		this.nome = nome;
		this.listaVariabili = new ArrayList<Variabile>();
	}

	/**
	 * Metodo per aggiungere una variabile alla lista variabili dato il suo nome.
	 * 
	 * @param var
	 */
	public void addVariabile(String var) {
		listaVariabili.add(new Variabile(var));
	}

	/**
	 * Overrdie del metodo toString.
	 */
	@Override
	public String toString() {
		return this.nome + " " + listaVariabili.toString();
	}

	// Getters.

	public ArrayList<Variabile> getListaVariabili() {
		return listaVariabili;
	}

	public String getNome() {
		return nome;
	}

	// Setters.

	public void setListaVariabili(ArrayList<Variabile> listaVariabili) {
		this.listaVariabili = listaVariabili;
	}

}
