import java.util.Scanner;

public class Question4 {
	
	public static void checkTrend(int a, int b, int c) {
		
		if(a<b && b<c) 
			System.out.println("Increasing");
		
		else if(a>b && b>c)
			System.out.println("Decreasing");
		
		else
			System.out.println("Neither increasing or decreasing order");
	}
	
	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first no.");
		int x= obj.nextInt();
		
		System.out.println("Enter second no.");
		int y= obj.nextInt();
		
		System.out.println("Enter third no.");
		int z= obj.nextInt();
		
		checkTrend(x,y,z);
	}

}
