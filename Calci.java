package Assessment;



public class Calci implements Calculator {

	@Override
	public void add(int a, int b) {
		System.out.println("Addition:"+ (a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction:"+ (a+b));		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("Multiplication:" +(a+b));
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("Division:" +(a+b));
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		Calci c=new Calci();
		c.add(10, 20);
		c.sub(10, 20);
		c.mul(10, 20);
		c.div(10, 20);
		

		
	}
	

}
