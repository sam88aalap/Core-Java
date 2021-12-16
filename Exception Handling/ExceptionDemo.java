import java.util.*;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value of a");
		a=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		
		try {
			c=a/b;
			System.out.println(c);
			
//			int[] intArray = {2,4,6,8};
//			System.out.println(intArray[10]);
		}catch(ArithmeticException e) {
			System.out.println("b cannot be zero");
		}catch(ArrayIndexOutOfBoundsException e) {                      //multiple catch blocks could be implemented
			System.out.println("Incorrect array index");
		}finally {
			System.out.println("Finally block");
		}
		sc.close();	
	}

}
