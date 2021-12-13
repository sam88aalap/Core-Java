import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee employee1, Employee employee2) {
		Integer empId1 = employee1.geteId();
		Integer empId2 = employee2.geteId();
		
		return empId1.compareTo(empId2);
	}

}
