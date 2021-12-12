import java.util.Scanner;

public class Question8 {
	
	public static void main(String args[]) {
		
		int[] array1 = new int[5];
		int small=1, big=1;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter array elements:");
		for(int i=0;i<array1.length;i++)
			array1[i]=obj.nextInt();
		
		for(int i=0;i<array1.length;i++) {
			
			if(array1[i]>big)
				big=array1[i];
			
			if(array1[i]<=small)
				small=array1[i];
		}
		
		System.out.println("Largest no:"+big);
		System.out.println("Smallest no:"+small);
		int d= big-small;
		System.out.println("Difference:"+d);
	}
	

}
