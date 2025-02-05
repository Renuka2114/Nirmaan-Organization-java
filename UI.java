package InterfaceTask;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.move();
		d.speak();
		
		System.out.println();
		
		Bird b=new Bird();
		b.move();
		b.speak();
		
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Name:");
		String name=sc.nextLine();
		System.out.println(Animal.isMammal(name));
		System.out.println(Animal.CATEGORY);
		
	}

}
