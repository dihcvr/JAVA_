package ex2;

public class TestOrder {
	public static void main(String[] args) {
		
		Runnable c1 = new Compteur("c1", 5);
		new Thread(c1).start();
		
		Runnable c2 = new Compteur("c2", 5);
		new Thread(c2).start();
	}
}
