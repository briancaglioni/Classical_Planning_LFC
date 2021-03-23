package util;

import java.util.ArrayList;

/**
 * Applicazione di uno specifico operatore. Viene specificata dal nome
 * dell'azione e da una lista di oggetti corrispondenti alle variabili
 * dell'operatore.
 *
 */
public class Applicazione {
	final private String nome;
	private ArrayList<Oggetto> listaOggetti;
	private Operatore operatore;

	/**
	 * Costruttore specificando il nome dell'azione. L'operatore viene inizializzato
	 * nullo. La lista oggetti viene inizializzata vuota.
	 * 
	 * @param nome
	 */
	public Applicazione(String nome) {
		super();
		this.nome = nome;
		this.listaOggetti = new ArrayList<>();
		this.operatore = null;
	}

	/**
	 * Metodo per aggiungere un oggetto alla lista di oggetti dato il nome.
	 * 
	 * @param nomeOggetto
	 */
	public void addOggetto(String nomeOggetto) {
		listaOggetti.add(new Oggetto(nomeOggetto));
	}

	// Getters.

	public ArrayList<Oggetto> getListaOggetti() {
		return listaOggetti;
	}

	public void setListaOggetti(ArrayList<Oggetto> listaOggetti) {
		this.listaOggetti = listaOggetti;
	}

	public String getNome() {
		return nome;
	}

	public Operatore getOperatore() {
		return operatore;
	}

	// Setters.

	public void setOperatore(Operatore operatore) {
		this.operatore = operatore;
	}

	/**
	 * Override del metodo toString.
	 */
	@Override
	public String toString() {
		return "Applicazione [nome=" + nome + ", listaOggetti=" + listaOggetti + "]";
	}

	// traduzione -> stati intermedi
	// parametro di esecuzione
//	public void esegui() {
//		
//		System.out.println("Azione eseguita");
//	}

}
