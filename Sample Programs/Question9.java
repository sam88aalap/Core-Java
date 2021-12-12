
public class Question9 {
	
	public static boolean checkSum(int a) {
		
		return a==30;
	}
	public static void main(String args[]) {
		
		int[] array1= {10,20,30,10,20,40,10};
		int sum=0;
		
		for(int i=0;i<array1.length;i++) {
			
			if(array1[i]==10) {
				sum+=array1[i];
			}
		}
		System.out.println("Result:"+checkSum(sum)+" The sum is "+sum);
	}

}
