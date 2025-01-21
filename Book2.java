package day15;

public class Book2 {
	 int id;
	 String name;
	 String author;
	 double price;
	 
	 @Override
	public String toString() {
		return "Book2 [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	 
	public Book2(int id, String name, String author, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book2() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
