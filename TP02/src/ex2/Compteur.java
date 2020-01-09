package ex2;

public class Compteur implements Runnable {
	private String nom;
	private int maxValue;
	
	public Compteur(String nom, int maxValue) {
		this.nom = nom;
		this.maxValue = maxValue;
	}

	@Override
	public void run() {
		for(int i=1;i<= this.maxValue ;i++) {
			System.out.println(this.nom + " --> " + i);
			try {
				Thread.sleep((int) (Math.random() * 2000));
			}
			catch(Exception e) {
				
			}
		}
	}
	
	
	
}
