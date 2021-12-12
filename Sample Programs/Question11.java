import java.util.Scanner;

public class Question11 {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter lower limit");
		int x=sc.nextInt();
		System.out.println("Enter upper limit");
		int y=sc.nextInt();
		System.out.println("Enter divisor");
		int z=sc.nextInt();
		
		System.out.println("the numbers divisible by "+z+"are:");
		for(int i=x+1;i<y;i++) {
			
			if(i%z==0)
				System.out.println(i);
		}
	}

}
