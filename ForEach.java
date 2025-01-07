package day11;

import java.util.Scanner;

public class ForEach {
	
	boolean isValid(int age) {
		if((age>=18)&&(age<=100)) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[]args) {
		
		int[] numbers = {20,40,60,80,100};
		
		
		for(int num: numbers) {
			System.out.println(num);
		}
		
		System.out.println();
		
		
		int[] nums = new int[6];
		
		nums[0] = 2;
		nums[1] = 4;
		nums[3] = 6;
		nums[4] = 8;
		nums[5] = 10;
		int total = 0;
		
		
		
		for(int num : nums) {
			total += num;
		}
		System.out.println(total);
		
		System.out.println();
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		ForEach fs = new ForEach();
		
		int age= sc.nextInt();
		
		if(fs.isValid(age)) {
			System.out.println("You are eligible");
		}
		else {
			System.out.println("You are not eligible");
		}
		
		
		
		
		
		
}
	
	

}
