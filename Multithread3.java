package MultiThreading;

class ClassA{
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

class ClassB{
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
public class Multithread3 {
	public static void main(String[] args) {
		ClassA c1 =new ClassA();
		ClassB c2 =new ClassB();
		
		Thread tr1=new Thread() {
			public void run(){
				c1.display();
				
			}
		};
		
		Thread tr2=new Thread() {
			public void run() {
				c2.display();
			}
		};
		tr1.start();
		tr2.start();
	}

}
