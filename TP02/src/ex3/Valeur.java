package ex3;


public class Valeur {
	
	private int valeur;
	public Valeur() {
		
	}
	public Valeur(int valeur) {
		this.valeur = valeur;
	}
	
	public int getVal() {
		return this.valeur;
	}
	
	public synchronized void add(int i) {
		this.valeur += i;
	}
	public String toString() {
		return this.valeur+ " ";
	}
	
}

