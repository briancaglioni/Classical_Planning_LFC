package util;

import java.util.ArrayList;

public class Azione {
	
	final private String nome;
	private ArrayList<AttributoVariabile> listaAttributiVariabili;
	public Azione(String nome) {
		super();
		this.nome = nome;
		this.listaAttributiVariabili = new ArrayList<AttributoVariabile>();
	}
	public ArrayList<AttributoVariabile> getListaAttributiVariabili() {
		return listaAttributiVariabili;
	}
	public void setListaAttributiVariabili(ArrayList<AttributoVariabile> listaAttributiVariabili) {
		this.listaAttributiVariabili = listaAttributiVariabili;
	}
	public String getNome() {
		return nome;
	}
	

	
}
