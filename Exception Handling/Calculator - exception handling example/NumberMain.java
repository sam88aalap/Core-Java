import java.util.*;

public class NumberMain {
	public static void main(String[] args) {
		
		int a,b,choice;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\nEnter first number");
			a=sc.nextInt();
			System.out.println("Enter second number");
			b=sc.nextInt();
			Number n = new Number(a,b);
			
			System.out.println("___________________CALCULATOR___________________");
			System.out.println("\n1. ADD\n2.SUBTRACT\n3.MULTIPLY\n4.DIVIDE\n5.EXIT\n");
			choice=sc.nextInt();
			
			if(choice==5) 
				break;
			switch(choice) {
			
			case 1:{
				n.add();
				break;
			}
			
			case 2:{
				n.sub();
				break;
			}
			
			case 3:{
				n.mul();
				break;
			}
			
			case 4:{
				n.div();
				break;
			}
			
			default: {
				System.out.print("WRONG CHOICE!!!");
				break;
			}
			
			}
			
		}
		
	}

}
