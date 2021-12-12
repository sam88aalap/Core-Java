import java.util.Random;

public class TestCompartment {
	
	public static void main(String[] args) {
		
		Compartment[] compartment = new Compartment[10];
        Random r=new Random();
		
		for(int i=0;i<compartment.length;i++) {
			int randomNumber=r.nextInt(4);
			if (randomNumber==1)
				compartment[i]=new FirstClass();
			else if (randomNumber==2)
				compartment[i]=new General();
			else if (randomNumber==3)
				compartment[i]=new Ladies();
			else
				compartment[i]=new Luggage();
		}
		
for(int i=0;i<compartment.length;i++) {
			
			if( compartment[i] instanceof FirstClass)
				System.out.println("Compartment "+(i+1)+" is a first class.");
			else if( compartment[i] instanceof General)
				System.out.println("Compartment "+(i+1)+" is a general.");
			else if( compartment[i] instanceof Ladies)
				System.out.println("Compartment "+(i+1)+" is a ladies.");
			else if( compartment[i] instanceof Luggage)
				System.out.println("Compartment "+(i+1)+" is a luggage.");
			
			compartment[i].Notice();
			
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				
	}
   }
}
