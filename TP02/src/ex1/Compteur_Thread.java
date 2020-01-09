package ex1;

public class Compteur_Thread {
	
	public static void main(String [] args) {
		
		Thread t1=new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						
					}
				}
			}
		};
		t1.start();
		
		Thread t2=new Thread() {
			public void run() {
				for(int i=1000;i>0;i--) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					}
					catch(Exception e) {
						
					}
				}
			}
		};
		t2.start();
	}
	
}
