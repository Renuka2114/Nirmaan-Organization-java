package day3;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter the nummber"); int mark = sc.nextInt();
		 * 
		 * if ((mark >= 35) && (mark <= 100)) {
		 * 
		 * if (mark >= 90) { System.out.println("Grade A"); }
		 * 
		 * else if (mark >= 80) { System.out.println("Grade B"); } else {
		 * System.out.println("Grade c"); } } else if (mark >100){
		 * 
		 * System.out.println ("invalid mark"); }
		 * 
		 * 
		 * else { System.out.println("fail"); }
		 * 
		 * } }
		 */

		System.out.println("Enter your choice");
		System.out.println("1 for add");
		System.out.println("2 for sub");
		System.out.println("3 for mul");
		System.out.println("4 for div");
		System.out.println("5 for mod");

		int key = sc.nextInt();
		switch (key) {
		case 1: {

			System.out.println("Enter the first number");
			int fnum = sc.nextInt();
			System.out.println("Enter the second number");
			int snum = sc.nextInt();
			System.out.println("Addition:" + (fnum + snum));
			break;
		}
		case 2: {

			System.out.println("Enter the first number");
			int fnum = sc.nextInt();
			System.out.println("Enter the second number");
			int snum = sc.nextInt();
			System.out.println("Subtraction:" + (fnum - snum));
			break;
		}
		case 3:{
			
			System.out.println("Enter the first number");
			int fnum = sc.nextInt();
			System.out.println("Enter the second number");
			int snum = sc.nextInt();
			System.out.println("Multiplication:" + (fnum*snum));
			break;
			}
		case 4:{
			
			System.out.println("Enter the first number");
			int fnum = sc.nextInt();
			System.out.println("Enter the second number");
			int snum = sc.nextInt();
			System.out.println("Division:" + (fnum/snum));
			break;
			}
		case 5:{
			
			System.out.println("Enter the first number");
			int fnum = sc.nextInt();
			System.out.println("Enter the second number");
			int snum = sc.nextInt();
			System.out.println("Modulus:" + (fnum%snum));
			break;
			}

		}
	}

}