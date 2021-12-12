import java.util.Scanner;

public class Question5 {
	
	public static void main(String args[]) {
		
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter 10 no.s");
		for(int i=0;i<array1.length;i++)
			array1[i]=obj.nextInt();
		
		System.out.println("Enter 10 no.s");
		for(int i=0;i<array2.length;i++)
			array2[i]=obj.nextInt();
		
		System.out.println("Common nos. are:");
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				
				if(array1[i]==array2[j])
					System.out.println(array1[i]);
			}
		}
	}

}
