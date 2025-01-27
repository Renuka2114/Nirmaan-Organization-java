package School;

import java.util.Scanner;

public class StudentUI {
	public static void main(String[]args) {
		Student std1 = new Student();
		boolean iswork=true;
		while(iswork) {
			
			Scanner  sc=new Scanner(System.in);
			System.out.println("Enter your choice");
			System.out.println("Enter 1 for add");
			System.out.println("Enter 2 for update");
			System.out.println("Enter 3 for show");
			System.out.println("Enter 0 for exit");
			
				
			int key =sc.nextInt();
			sc.nextLine();
			if(key==1) {
				System.out.println("Enter your Id:");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your Name:");
				String name=sc.nextLine();
				System.out.println("Enter your RollNo");
				long rollno=sc.nextLong();
				System.out.println("Enter your MobileNo");
				long mobileno=sc.nextLong();
				
				std1 = new Student(id,name,rollno,mobileno);
						
			}
			
			else if(key==2){
				
					System.out.println("Enter 1 to modilfy id:");
					System.out.println("Enter 2 to modilfy name:");
					System.out.println("Enter 3 to modilfy author:");
					System.out.println("Enter 4 to modilfy price:");
					
					int keys=sc.nextInt();
					sc.nextLine();
					if(keys==1) {
						System.out.println("Enter your Id:");
						int id = sc.nextInt();
						
						std1.setId(id);
						sc.nextLine();		
						}
					else if(keys==2){
						
						System.out.println("Enter your Name:");
						String name = sc.nextLine();
						std1.setName(name);
						
					}
					else if(keys==3) {
						
						System.out.println("Enter your RollNo:");
						long rollno = sc.nextLong();
						std1.setRollno(rollno);
					}
					else if(keys==4) {
						System.out.println("Enter your MobileNo:");
						long mobileno =sc.nextLong();
						std1.setMobileno(mobileno);
					}
					else {
						System.out.println("Enter your correct input");
					}
			}
					
			else if (key==3)
					{
						System.out.println(std1);
						
						
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

			
			
					
		
	

