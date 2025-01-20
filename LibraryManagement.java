package day14;

public class LibraryManagement {
	
	public static void main(String[]args) {
		
		Book sr1 = new Book();
		Book sr2 = new Book(2,"Ninja","Renu", 3000);
		sr1.setId(01);
		sr1.setName("Harry Potter");
		sr1.setAuthor("James");
		sr1.setPrice(2000);
		
		System.out.println(sr1.getId());
		System.out.println(sr1.getName());
		System.out.println(sr1.getAuthor());
		System.out.println(sr1.getPrice());
		System.out.println(sr1);
		System.out.println(sr2);
		
	}

}
