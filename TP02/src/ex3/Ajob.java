package ex3;

public class Ajob implements Runnable {
	public Valeur myVal;
	public int i;
	
	public Ajob(Valeur myVal, int i) {
		this.myVal = myVal;
		this.i = i;
	}
	
	@Override
	public void run() {
		
		for(int k=0;k<= 10;k++) {
			this.myVal.add(this.i);
			System.out.println(this.myVal);
		}
		
	}
	
	
}
