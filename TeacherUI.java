package School;

import java.util.Scanner;

public class TeacherUI {
	public static void main(String[]args) {
		Teacher tech1 = new Teacher();
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
			switch(key) {
			case 1:{
				System.out.println("Enter your Id:");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your Name:");
				String name=sc.nextLine();
				System.out.println("Enter your MobileNo");
				long mobileno=sc.nextLong();
				System.out.println("Enter your Salary");
				double salary=sc.nextDouble();				
				tech1 = new Teacher(id,name,mobileno,salary);
				break;
						
			}
			
			case 2: {
				System.out.println("Enter 1 to modilfy id:");
				System.out.println("Enter 2 to modilfy name:");
				System.out.println("Enter 3 to modilfy mobileno:");
				System.out.println("Enter 4 to modilfy salary:");
				
				int keys=sc.nextInt();
				sc.nextLine();
				if(keys==1) {
					System.out.println("Enter your Id:");
					int id = sc.nextInt();
					
					tech1.setId(id);
					sc.nextLine();		
					}
				else if(keys==2){
					
					System.out.println("Enter your Name:");
					String name = sc.nextLine();
					tech1.setName(name);
					
				}
				else if(keys==4) {
					System.out.println("Enter your MobileNo:");
					long mobileno =sc.nextLong();
					tech1.setMobileno(mobileno);
				}
                else if(keys==3) {
					
					System.out.println("Enter your Salary:");
					double salary = sc.nextDouble();
					tech1.setSalary(salary);
				}
				else {
					System.out.println("Enter your correct input");
				}
				break;
			}
			
			case 3: {
				System.out.println(tech1);
				break;
			}
			
			case 0: {
				System.out.println("Thank you");
				iswork=false;
				break;
		
				
				
			}
			
			default: {
				System.out.println("Enter the correct choice");
			}
			}
			
				
	}

}
}
