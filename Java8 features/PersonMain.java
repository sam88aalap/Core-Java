import java.util.*;
public class PersonMain {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Ram","Pune",30));
		persons.add(new Person("Sam","Kochi",22));
		persons.add(new Person("Ron","Banglore",23));
		persons.add(new Person("John","Delhi",30));
		persons.add(new Person("Nisha","Pune",33));
		persons.add(new Person("Kevin","Mumbai",26));
		
//		System.out.println(persons);
		
		Person person = new Person();
		Collections.sort(persons,person::compareName);
		System.out.println(persons);
		Collections.sort(persons,person::compareAge);
		System.out.println(persons);
		Collections.sort(persons,Person:: compareByAddress);
		System.out.println(persons);
	}

}
