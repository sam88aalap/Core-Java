
public class CalcAverage {
	
	public double avgFirstN(double n) 
	{
		double avg=0;
		if (n!=(int)n) {
			try {
				throw new IllegalArgumentException();
			}catch(IllegalArgumentException e) {
			System.out.println(n+" is not Natural number.");
		     }	
		}
		else {
			for(int i=1;i<=n;i++)
				avg+=i;
		avg=avg/n;
		}
			
		return (double)avg;
	
	}
}
			
			
		
		
		


