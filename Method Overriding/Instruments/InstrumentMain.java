package Instrument;
import java.util.Random;

public class InstrumentMain {
	
	public static void main(String[] args) {
		Instrument[] instrument = new Instrument[10];
		Random r=new Random();
		
		for(int i=0;i<instrument.length;i++) {
			int randomNumber=r.nextInt(3);
			if (randomNumber==1)
				instrument[i]=new Piano();
			else if (randomNumber==2)
				instrument[i]=new Flute();
			else 
				instrument[i]=new Guitar();
		}
		
		for(int i=0;i<instrument.length;i++) {
			
			if( instrument[i] instanceof Piano)
				System.out.println("Instrument "+(i+1)+" is a piano.");
			else if( instrument[i] instanceof Flute)
				System.out.println("Instrument "+(i+1)+" is a flute.");
			else if( instrument[i] instanceof Guitar)
				System.out.println("Instrument "+(i+1)+" is a guitar.");
			
			instrument[i].play();
			
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			
		}			
	}
}
