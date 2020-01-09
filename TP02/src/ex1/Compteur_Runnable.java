package ex1;

public class Compteur_Runnable  {
	public static void main(String [] args) {
			
			Runnable t1=new Thread() {
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
			
			new Thread(t1).start();
			
			Runnable t2=new Thread() {
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
			new Thread(t2).start();
			
	}
}
