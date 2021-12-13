import java.util.TreeSet;
import java.util.Set;

public class EmployeeSet {
	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<Employee>(new EmployeeIdComparator());
		set.add(new Employee("Ron","Manager",1213,46000));
		set.add(new Employee("Jon","Assistant Manager",1223,36000));
		set.add(new Employee("Sam","Team Lead",1233,56000));
		
		for (Employee i: set) {
			System.out.println(i);
		}
	}

}
