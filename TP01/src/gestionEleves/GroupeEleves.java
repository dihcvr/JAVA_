package gestionEleves;
import java.util.*;
import java.util.Collections;

public class GroupeEleves {
	ArrayList<Eleve> listeEleves =new ArrayList<Eleve>();
	
	public int nombre() {
		return listeEleves.size();
	}
	public ArrayList<Eleve> getListe(){
		return this.listeEleves;
	}
	public void ajouterEleve(Eleve eleve) {
		this.listeEleves.add(eleve);
	}
	public Eleve chercher(String nom) {
		for(Eleve e: listeEleves) {
			if(e.getNom().equals(nom)) {
				return e;
			}
		}
		return null;
	}
	public void lister() {
		for(Eleve e: listeEleves) {
			System.out.println(e.toString());
		}
	}
	
	
	public Eleve meilleurEleve() {
	
		return Collections.max(listeEleves);
		
	}
	public void trierEleves() {
		
		Collections.sort(listeEleves);	
		
	}
	
	public static void main(String [] args) {
		Eleve e1=new Eleve("e1");
		e1.ajouterNote(19);
		e1.ajouterNote(14);
		
		Eleve e2=new Eleve("e2");
		e2.ajouterNote(11);
		e2.ajouterNote(18);
		
		GroupeEleves grp=new GroupeEleves();
		grp.ajouterEleve(e1);
		grp.ajouterEleve(e2);
		
		System.out.println("Meilleur Eleve: "+grp.meilleurEleve());
		
		System.out.println("Avant le tri: ");
		grp.lister();
		
		grp.trierEleves();
		
		System.out.println("Apres le tri: ");
		grp.lister();
		
	}
}
