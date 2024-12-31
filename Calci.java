package day8;

public class Calci {
	
	int frstnum;
	int scndnum;
	
	void add() {
		System.out.println("Add :" + (frstnum+scndnum));
	}
	
	void sub() {
		System.out.println("Sub :" + (frstnum-scndnum));
	}
	
	void multiple() {
		System.out.println("Multiple :" + (frstnum*scndnum));
	}
	
	void divide() {
		System.out.println("Divide :" + (frstnum/scndnum));
	}
	
	void modulus() {
		System.out.println("Modulus :" + (frstnum%scndnum));
	}
	
	public static void main (String[]args) {
		Calci calculator =new Calci();
		calculator.frstnum = 21;
		calculator.scndnum = 14;
		calculator.add();
		calculator.sub();
		calculator.multiple();
		calculator.divide();
		calculator.modulus();
		
	}
	
	


}
