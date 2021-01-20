package util;

import java.util.ArrayList;

public class Applicazione {
	final private String nome;
	private ArrayList<Oggetto> listaOggetti;
	private Operatore operatore;
	
	public ArrayList<Oggetto> getListaOggetti() {
		return listaOggetti;
	}
	public void setListaOggetti(ArrayList<Oggetto> listaOggetti) {
		this.listaOggetti = listaOggetti;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "Applicazione [nome=" + nome + ", listaOggetti=" + listaOggetti + "]";
	}
	public Applicazione(String nome) {
		super();
		this.nome = nome;
		this.listaOggetti = new ArrayList<>();
		this.operatore = null;
	}
	
	public Operatore getOperatore() {
		return operatore;
	}
	public void setOperatore(Operatore operatore) {
		this.operatore = operatore;
	}
	public void addOggetto(String text) {
		listaOggetti.add(new Oggetto(text));
	}
	
	//traduzione -> stati intermedi
	//parametro di esecuzione
//	public void esegui() {
//		
//		System.out.println("Azione eseguita");
//	}
	
}
