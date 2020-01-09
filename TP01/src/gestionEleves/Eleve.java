package gestionEleves;
import java.util.*;

public class Eleve implements Comparable<Eleve> {
	
	private String nom;
	private ArrayList<Integer> notes = new ArrayList<Integer>();
	private double moyenne=0;

	public Eleve(String nom) {
		this.nom=nom;
	}
	public double getMoyenne() {
		return this.moyenne;
	}
	public void ajouterNote(int note) {
		this.notes.add(note);
		/*int s=0;
		for (Integer n: this.notes) {
			s+=n;
		}
		this.moyenne=s/this.notes.size();
		*/
		this.moyenne = ((this.moyenne*(this.notes.size()-1))+note)/(this.notes.size());
	}
	public String getNom() {
		return this.nom;
	}
	public ArrayList<Integer> getListNotes(){
		return this.notes;
	}
	public String toString() {
		return "nom: "+this.nom + 
				" notes: "+this.notes+
				" moyenne: "+this.moyenne;
	}
	@Override
	public int compareTo(Eleve autreEleve) {
		if(this.moyenne < autreEleve.moyenne) return -1;
		if(this.moyenne > autreEleve.moyenne) return 1;
		else return 0;
	}
	
	public static void main(String [] args) {
		Eleve e1=new Eleve("e1");
		e1.ajouterNote(17);
		Eleve e2=new Eleve("e2");
		e2.ajouterNote(15);
		
		System.out.println(e1.compareTo(e2));
		
	}
}
