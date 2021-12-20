import java.util.*;

public class NaturalNumberTest {
	public static void main(String[] args) {
		double n = 0;
		Scanner sc = new Scanner(System.in);
		CalcAverage average = new CalcAverage();
			System.out.println("Enter a Natural number :");
			n=sc.nextDouble();
			System.out.println("Average is "+average.avgFirstN(n));
			sc.close();
		
		
	}
		
}
