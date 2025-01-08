package day13;

class EmployeesFullDetails{
	private String name;
	private int id;
	private long phoneno;
	private String salary;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setPhoneNo(long phoneno) {
		this.phoneno = phoneno;
	}
	public long getLong() {
		return phoneno;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getString() {
		return salary;
	}
	
	
	public String toString() {
		return "Employee name: " +name+ "\nEmployee id:" +id+ "\nEmployee phoneno:" +phoneno+ "\nEmployee salary:" +salary;
	}
	
	

	
}

public class EmployeeGetSet {
	public static void main(String[]args) {
		EmployeesFullDetails emp1 = new EmployeesFullDetails();
		emp1.setName("resh");
		System.out.println(emp1.getName());
		emp1.setId(21);
		System.out.println(emp1.getId());
		emp1.setPhoneNo(9842561751l);
		System.out.println(emp1.getLong());
		emp1.setSalary("50000");
		System.out.println(emp1.getString());
		
		System.out.println();
		
		EmployeesFullDetails emp2 = new EmployeesFullDetails();
		emp2.setName("renu");
		System.out.println(emp2.getName());
		emp2.setId(22);
		System.out.println(emp2.getId());
		emp2.setPhoneNo(9842561551l);
		System.out.println(emp2.getLong());
		emp2.setSalary("60000");
		System.out.println(emp2.getString());
		
		System.out.println();
		
		EmployeesFullDetails emp3 = new EmployeesFullDetails();
		emp3.setName("sk");
		System.out.println(emp3.getName());
		emp3.setId(23);
		System.out.println(emp3.getId());
		emp3.setPhoneNo(9942561751l);
		System.out.println(emp3.getLong());
		emp3.setSalary("70000");
		System.out.println(emp3.getString());
		
		System.out.println();
		
		EmployeesFullDetails emp4 = new EmployeesFullDetails();
		emp4.setName("raj");
		System.out.println(emp4.getName());
		emp4.setId(24);
		System.out.println(emp4.getId());
		emp4.setPhoneNo(9842561752l);
		System.out.println(emp4.getLong());
		emp4.setSalary("80000");
		System.out.println(emp4.getString());
		
		System.out.println();
		
		System.out.println(emp1);
		System.out.println();
		
		System.out.println(emp2);
		System.out.println();
		
		System.out.println(emp3);
		System.out.println();
		
		System.out.println(emp4);
		
		
		
		
		
		
		
		
		
		
	}

}
