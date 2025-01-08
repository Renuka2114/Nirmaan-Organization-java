package day10;

public class Constructor {
	int id;
	String name;
	
	Constructor(int id, String name) {
		this.id = id;
		this.name = name;
	
	}
	Constructor(){
		
	}
	public static void main(String[]args) {
		Constructor car1 = new Constructor(21, "suzuki");
		System.out.println(car1.id +" "+ car1.name);
		Constructor car2 = new Constructor();
		car2.id = 14;
		car2.name = "benz";
		
		System.out.println(car2.id +" " + car2.name);
		
	}

}
