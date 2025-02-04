package day14;

public class Book {
	private int id;
	private String name;
	private String author;
	private double price;
	
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
	
	public Book(int id,String name,String author,double price) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
		
	
	
	}
	
	public Book() {
		
	}
	
	public String toString() {
		return "Book Id: " + id + "\nBook Name: " + name + "\nBook Author: " + author + "\nBook Price: " + price;
	}
	


}
