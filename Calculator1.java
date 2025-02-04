package MultipleInterface;

public interface Calculator1 extends Calculator2{
	
	int NUM =10;
	void add(int a,int b);
	void sub(int a,int b);
	
	static void display() {
		System.out.println("Calculator");
	}
	
	default void Subtraction() {
		System.out.println(26-54-85-34);
	}

}
