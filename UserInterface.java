package Inheritance;

public class UserInterface {
	public static void main(String[] args) {
		
		
		
		//Single inheritance
		Car c=new Car();
		c.StartEngine();
		
		//Multilevel inheritance
		ElectricCar ec = new ElectricCar();
		ec.drive();
		ec.ChargeBattery();
		
		//Hierarchical inheritance
		Bike b =new Bike();
		b.StartEngine();
		b.KickStart();
		
	}

}
