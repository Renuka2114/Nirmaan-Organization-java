package School;

public class Teacher {
	int id;
	String name;
	long mobileno;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Teacher(int id, String name, long mobileno, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
		this.salary = salary;
	}
	public Teacher() {
		
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", salary=" + salary + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
