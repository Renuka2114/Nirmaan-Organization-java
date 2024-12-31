package day8;

public class Employee {
	String name;
	String id;
	String mobileNo;
	double salary;
	
	public static void main(String[]args) {
		Employee emp1 = new Employee();
		emp1.name = "Renu";
		emp1.id = "1";
		emp1.mobileNo = "9384653804";
		emp1.salary = 50000;
		
		Employee emp2 = new Employee();
		emp2.name = "sk";
		emp2.id = "2";
		emp2.mobileNo = "9346789319";
		emp2.salary = 30000;
		
		Employee emp3 = new Employee();
		emp3.name = "bala";
		emp3.id = "3";
		emp3.mobileNo = "9384676890";
		emp3.salary = 35000;
		
		Employee emp4 = new Employee();
		emp4.name = "rajii";
		emp4.id = "4";
		emp4.mobileNo = "7739053805";
		emp4.salary = 34000;
		
		Employee emp5 = new Employee();
		emp5.name = "kavi";
		emp5.id = "5";
		emp5.mobileNo = "9384658855";
		emp5.salary = 40000;
		
		System.out.println("Employee_name :" +emp1.name);
		System.out.println("Employee_id :" +emp1.id);
		System.out.println("Employee_mobileNo :" +emp1.mobileNo);
		System.out.println("Employee_salary :" +emp1.salary);
		
		
		
		
	}
	
	
	

}
