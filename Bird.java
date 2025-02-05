package InterfaceTask;

import java.util.Scanner;

public class Bird extends Dog {
	@Override
	public void move() {
		System.out.println("The bird flies in the sky");
	}
	
	@Override
	public void speak() {
		System.out.println("The bird says:Chirp Chirp!");
	}
	
	
}
