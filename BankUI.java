package BankManagement;

import java.util.Scanner;

public class BankUI {
	public static void main(String[] args) {
		
		Bank bank=new Bank();
		boolean iswork=true;
		
		while(iswork) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your choice");
			System.out.println("Enter 1 for add");
			System.out.println("Enter 2 for withdraw");
			System.out.println("Enter 3 for show");
			System.out.println("Enter 0 for exit");
			
			int key=sc.nextInt();
			
			System.out.println("Enter your pin:");
			int pin=sc.nextInt();
		
			if(pin==bank.getPin()) {
				if(key==1) {
					System.out.println("Enter your amount:");
					double amount=sc.nextDouble();
					bank.setBalance(bank.getBalance() + amount);
					
					}
				
		
			else if(key==2) {
				System.out.println("Enter the withdraw amount");
				double amount =sc.nextDouble();
				if(bank.getBalance()>=amount) {
					bank.setBalance(bank.getBalance() - amount);
					
				}
				else {
					System.out.println("Wrong Amount");
				}

				}
			else if(key==3) {
				System.out.println(bank);
				
			}
			else if(key==0){
				iswork =false;
				System.out.println("Thank You");
				
			}
			else {
				System.out.println("Enter your correct choice");
			}
			
			
			
		}
		else {
			iswork =false;
			System.out.println("Wrong pin");
			
		}
		
	}

}
}
