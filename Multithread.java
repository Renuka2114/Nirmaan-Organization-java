package MultiThreading;



class Class1 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Class 1");
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				System.out.println(e);
				
			}
			}
			
	}

	
}
class Class2 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Class 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
}

public class Multithread {
	public static void main(String[] args) {
		Class1 c1 =new Class1();
		Class2 c2 =new Class2();
		c1.start();
		c2.start();
	}

}
