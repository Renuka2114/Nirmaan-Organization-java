package day9;

import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[]args) {
		
		Calculator calci= new Calculator();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your FirstNum: ");
		int FirstNum = sc.nextInt();	
		System.out.println("Enter your SecondNum: ");
		int SecondNum = sc.nextInt();
		System.out.println("Addition:" + calci.add(FirstNum, SecondNum));
		System.out.println("Subtraction:" + calci.sub(FirstNum, SecondNum));
		System.out.println("Multiplication:" + calci.mul(FirstNum, SecondNum));
		System.out.println("Division:" + calci.div(FirstNum, SecondNum));
		System.out.println("Modulus" + calci.mod(FirstNum, SecondNum));
	

}
}