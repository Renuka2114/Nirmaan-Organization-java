package LibraryManagementSystem;

import java.util.Scanner;

import java.util.Vector;

public class Library {
	public static void main(String[] args) {
		Book bk = new Book();
		Scanner sc=new Scanner(System.in);
		Vector<Book> vec = new Vector<Book>();
		
		while(true){
		System.out.println("Enter your choice");
		System.out.println("Enter 1 for add");
		System.out.println("Enter 2 for show");
		System.out.println("Enter 3 for update");
		System.out.println("Enter 4 for delete");
		
		int key=sc.nextInt();
		sc.nextLine();
		if(key==1) {
			System.out.println("Enter your book id:");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter your book name:");
			String name=sc.nextLine();
			
			System.out.println("Enter your book author:");
			String author=sc.nextLine();
			
			System.out.println("Enter your book price");
			double price= sc.nextDouble();
			bk= new Book(id,name,author,price);
			vec.add(bk);
			}
		
		else if(key==2) {
			System.out.println(vec);
		}
		
		else if(key==3) {
			System.out.println("Enter your book id:");
			int id=sc.nextInt();
			sc.nextLine();
			
			boolean isthere =false;
			for(Book bkr:vec) {
				if(bkr.getId()==id) {
					System.out.println("Enter your book name:");
					String name=sc.nextLine();
					bkr.setName(name);
					
					System.out.println("Enter your book author:");
					String author=sc.nextLine();
					bkr.setAuthor(author);
					
					System.out.println("Enter your book price:");
					double price=sc.nextDouble();
					bkr.setAuthor(author);
					isthere=true;
					
				
				}
			}
			if(!isthere) {
				System.out.println("Not there");
			}
			
			}
		else if(key==4) {
			System.out.println("Enter your book id:");
			int id=sc.nextInt();
			sc.nextLine();
			
			for(Book bkr:vec) {
				if(bkr.getId()==id) {
					vec.remove(bkr);
					break;
					
				}
			}
			
			
		}
		
		}
	}

}
