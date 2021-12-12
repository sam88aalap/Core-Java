import java.util.Scanner;

public class Question6 {
	
public static void main(String args[]) {
		
		int[] array1 = new int[10];
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter elements of array (10 no.s)");
		for(int i=0;i<array1.length;i++)
			array1[i]=obj.nextInt();
		
		System.out.println("Enter the specific no.");
		int c= obj.nextInt();
		
		System.out.println("numbers whose sum="+ c + "are:");
		for(int i=0;i<array1.length;i++) {
			for(int j=i+1;j<array1.length;j++) {
				
				if(array1[i]+array1[j]==c)
					System.out.println(array1[i]+" and "+array1[j]);
			}
		}
	}

}
