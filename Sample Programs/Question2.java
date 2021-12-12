import java.util.Scanner;

public class Question2 {
	
	public static boolean sumCheck(int a, int b, int c) {
		return((a+b)==c||(b+c)==a||(c+a)==b);
	}
	
	public static void main(String args[]) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first no.");
		int x= obj.nextInt();
		
		System.out.println("Enter second no.");
		int y= obj.nextInt();
		
		System.out.println("Enter third no.");
		int z= obj.nextInt();
		
		System.out.println(sumCheck(x,y,z));
	}

}
