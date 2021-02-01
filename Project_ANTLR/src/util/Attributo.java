package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Attributo. Composto da un nome e da un oggetto a cui si riferisce
 * l'attributo.
 *
 */
public class Attributo {
	final String nome;
	final ArrayList<Oggetto> listaOggetti;

	/**
	 * Costruttore specificando il nome dell'attributo e dell'oggetto a cui si
	 * riferisce.
	 * 
	 * @param name
	 * @param oggetto
	 */
	public Attributo(String name) {
		super();
		this.nome = name;
		this.listaOggetti = new ArrayList<Oggetto>();
	}
	
	public Attributo(String name, ArrayList<Oggetto> listaOggetti) {
		super();
		this.nome = name;
		this.listaOggetti = listaOggetti;
	}

	public void addOggetto(String o) {
		this.listaOggetti.add(new Oggetto(o));
	}
	/**
	 * Override del metodo equals
	 * 
	 * @param attr
	 */
	@Override
	public boolean equals(Object att) {
		if(! (att instanceof Attributo)) return false;
		if(this == att) return true;
		Attributo attr = (Attributo) att;
		return this.nome.equals(attr.getNome()) && listEqualsIgnoreOrder(attr.getListaOggetti(), this.listaOggetti);
	}
	
	public static <T> boolean listEqualsIgnoreOrder(List<T> list1, List<T> list2) {
	    return new HashSet<>(list1).equals(new HashSet<>(list2));
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode() + this.listaOggetti.hashCode();
	}

	/**
	 * Override del metodo toString.
	 */
	@Override
	public String toString() {
		return this.nome + "(" + getStringOggetti() + ")";
	}
	
	private String getStringOggetti() {
		String s = "";
		for (Oggetto o : listaOggetti)
			s += o.toString() + ", ";
		return s.substring(0, s.length()-2);
	}
	// Getters.

	public String getNome() {
		return nome;
	}

	public ArrayList<Oggetto> getListaOggetti() {
		return this.listaOggetti;
	}

	// Setters.

}
