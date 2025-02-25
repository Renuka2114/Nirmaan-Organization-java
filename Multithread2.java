package MultiThreading;

class Class3 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Class 1");
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				System.out.println(e);
				
			}
			}
			
	}
	
	
}

class Class4 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Class 2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
}


public class Multithread2 {
	public static void main(String[] args) {
		Class3 c1=new Class3();
		Class4 c2=new Class4();
		Thread tr1=new Thread(c1);
		Thread tr2=new Thread(c2);
		tr1.start();
		tr2.start();
		
	}

}
