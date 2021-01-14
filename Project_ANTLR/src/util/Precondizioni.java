package util;

import java.util.ArrayList;

public class Precondizioni {
	private ArrayList<AttributoVariabile> precond;
	
	public Precondizioni() {
		precond = new ArrayList<>();
	}
	
	public void addAttrVariabile(AttributoVariabile attrVar ) {
		precond.add(attrVar);
	}
	

	@Override
	public String toString() {
		return "Precondizioni [precond=" + precond + "]";
	}

	public ArrayList<AttributoVariabile> getPrecond() {
		return precond;
	}

	public void setPrecond(ArrayList<AttributoVariabile> precond) {
		this.precond = precond;
	}
	
	
}
