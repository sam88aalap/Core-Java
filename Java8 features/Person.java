
public class Person {

	private String name, address;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public Person() {
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
	// compare method without using comparator class (method reference)
	
	public int compareName(Person person1,Person person2) {
		String name1=person1.name;
		String name2=person2.name;
		
		return name1.compareTo(name2);
	}
	
	public int compareAge(Person person1, Person person2) {
		Integer age1= person1.age;
		Integer age2 = person2.age;
		
		return age1.compareTo(age2);
	}
	
	public static int compareByAddress(Person person1, Person person2) {
		return person1.address.compareToIgnoreCase(person2.address);
	}
	
}
