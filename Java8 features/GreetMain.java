
public class GreetMain {
	public static void main(String[] args) {
//		Greet greetings;
//		greetings=new GoodMorning();
//		greetings.greet();
//		greetings=new GoodEvening();
//		greetings.greet();
		
//		// 1. lambda expression without any parameter and return
//		Greet greet1 =() -> System.out.println("Greet1");
//		greet1.greet();
		
		// 2. with parameter without return
//		Greet greet1 =(String name) -> System.out.println("Hello "+name);
//		Greet greet2 =(name2) -> System.out.println("Hello "+name2);
//		Greet greet3 =name3 -> System.out.println("Hello "+name3);
//		greet1.greet("Sam");
//		greet2.greet("Sam");
//		greet3.greet("Sam");
		
		//3. no parameter but returns
//		Greet greet4 = () -> "Good Morning";
//		Greet greet5 = () -> {return "Good evening ";};
//		System.out.println(greet4.greet());
//		System.out.println(greet5.greet());
		
		//4. returns a value and accept parameter
		Greet greet6 = (String name) -> name+" Good Morning";
		Greet greet7 = (name) -> {return name+" Good evening ";};
		System.out.println(greet6.greet("Sam"));
		System.out.println(greet7.greet("Ron"));
	}

}
