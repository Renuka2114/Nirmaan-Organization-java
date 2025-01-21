package day15;

import java.util.Scanner;

public class Library {
	public static void main(String[]args) {
		Book2 bk1 = new Book2();
		boolean iswork=true;
		
		while(iswork) {
		Scanner sc= new Scanner(System.in);
			
	    System.out.println("Enter your choice");
		System.out.println("Enter 1 for add");
		System.out.println("Enter 2 for update");
		System.out.println("Enter 3 for show");
		System.out.println("Enter 0 for exit");
		
		int key =sc.nextInt();	
		if(key ==1) {
			System.out.println("Enter your Id:");
			int id = sc.nextInt();
			
			sc.nextLine();			
			System.out.println("Enter your Name:");
			String name = sc.nextLine();
			System.out.println("Enter your Author:");
			String author = sc.nextLine();
			System.out.println("Enter your Price:");
			double price =sc.nextDouble();
			
			bk1 = new Book2(id, name, author,price);
		
		}
		
		else if(key==2){
			System.out.println("Enter 1 to modilfy id:");
			System.out.println("Enter 2 to modilfy name:");
			System.out.println("Enter 3 to modilfy author:");
			System.out.println("Enter 4 to modilfy price:");
			
			int keys=sc.nextInt();
			if(keys==1) {
				System.out.println("Enter your Id:");
				int id = sc.nextInt();
				
				bk1.setId(id);
						
				
			}
			else if(keys==2){
				sc.nextLine();
				System.out.println("Enter your Name:");
				String name = sc.nextLine();
				bk1.setName(name);
			}
			else if(keys==3) {
				System.out.println("Enter your Author:");
				String author = sc.nextLine();
				bk1.setAuthor(author);
			}
			else if(keys==4) {
				System.out.println("Enter your Price:");
				double price =sc.nextDouble();
				bk1.setPrice(price);
			}
			else {
				System.out.println("Enter your correct input");
			}
			
			
			
			
			
		} 
		else if (key==3)
		{
			System.out.println(bk1);
			
			
		}
		else if(key==0){
			iswork=false;
			System.out.println("Thank you");
		}
		else {
			System.out.println("Enter the correct choice");
			
		}


		}
	}
	
}
