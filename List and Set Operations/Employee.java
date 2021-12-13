
public class Employee {
	
	private String name;
	private String designation;
	private int eId;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", eId=" + eId + ", salary=" + salary + "]";
	}
	public Employee(String name, String designation, int eId, double salary) {
//		super();
		this.name = name;
		this.designation = designation;
		this.eId = eId;
		this.salary = salary;
	}
	

}
