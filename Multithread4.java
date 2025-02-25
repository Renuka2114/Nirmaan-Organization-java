package MultiThreading;

class Class11{
	public void display() {
		for(int i=0;i<=100;i++) {
			System.out.println("Class A");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Class22{
	public void display() {
		for(int i=0;i<=100;i++) {
			System.out.println("Class B");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Multithread4 {
	public static void main(String[] args) {
		Class11 c1=new Class11();
		Class22 c2=new Class22();
		
		Runnable r1=new Runnable() {
			public void run(){
				c1.display();
				
			}
			
		};
		
		Runnable r2=new Runnable() {
			public void run(){
				c2.display();
				
			}
			
		};
		
		Thread tr1=new Thread(r1);
		Thread tr2=new Thread(r2);
		
		tr1.start();
		tr2.start();
	}

}
