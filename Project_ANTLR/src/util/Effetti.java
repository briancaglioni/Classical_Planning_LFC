package util;

import java.util.ArrayList;

public class Effetti {
	ArrayList<AttributoVariabile> effetti;
	
	public Effetti() {
		effetti = new ArrayList<>();
	}
	
	public void addAttrVariabile(AttributoVariabile attrVar ) {
		effetti.add(attrVar);
	}
	

	@Override
	public String toString() {
		return "Effetti [effetti=" + effetti + "]";
	}

	public ArrayList<AttributoVariabile> getEffetti() {
		return effetti;
	}

	public void setEffetti(ArrayList<AttributoVariabile> effetti) {
		this.effetti = effetti;
	}
	
	
}
