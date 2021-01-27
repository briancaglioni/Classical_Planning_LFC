package util;

import java.util.ArrayList;

/**
 * Stato specificato da un nome e da una lista di attributi.
 */
public class Stato extends Symbol {

	final private String nome;
	private ArrayList<Attributo> listaAttributi;

	/**
	 * Costruttore specificando il nome dello stato. La lista di attributi è
	 * inizialmente vuota.
	 * 
	 * @param nome
	 */
	public Stato(String nome) {
		this.nome = nome;
		this.listaAttributi = new ArrayList<>();
	};

	/**
	 * Costruttore specificando il nome dello stato e una lista di attributi.
	 * 
	 * @param nome
	 * @param listaAttributi
	 */
	public Stato(String nome, ArrayList<Attributo> listaAttributi) {
		this.nome = nome;
		this.listaAttributi = new ArrayList<Attributo>();
		for (Attributo a : listaAttributi) {
			this.listaAttributi.add(new Attributo(a.getNome(), new Oggetto(a.getOggetto().getNome())));
		}

	};

	/**
	 * Override del metodo equals.
	 */
	@Override
	public boolean equals(Object stato) {
		if (stato instanceof Operatore)
			return false;
		return this.nome.equals(((Stato) stato).getNome());
	}

	/**
	 * Override del metodo toString.
	 */
	@Override
	public String toString() {
		return this.nome + " " + this.listaAttributi.toString();
	}

	// Getters.

	public String getNome() {
		return nome;
	}

	public ArrayList<Attributo> getListaAttributi() {
		return listaAttributi;
	}

	// Setters.

	public void setListaAttributi(ArrayList<Attributo> listaAttributi) {
		this.listaAttributi = listaAttributi;
	}

	public void addAttributo(Attributo a) {
		listaAttributi.add(a);
	}
}
