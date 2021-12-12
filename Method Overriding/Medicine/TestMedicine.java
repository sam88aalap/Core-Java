import java.util.Random;

public class TestMedicine {
	public static void main(String[] args) {
		 Medicine[] medicine = new Medicine[10];
		 Random r = new Random();
		  for(int i=0;i<medicine.length;i++) {
			  int randomNumber=r.nextInt(3);
			  if(randomNumber==1)
				  medicine[i]= new Tablet();
				else if (randomNumber==2)
					medicine[i]=new Ointment();
				else 
					medicine[i]=new CoughSyrup();
		  }
		  
		  for(int i=0;i<medicine.length;i++) {
			  if(medicine[i] instanceof Tablet)
				  System.out.println("Medicine:"+(i+1)+"is a Tablet");
			  else if(medicine[i] instanceof Ointment)
				  System.out.println("Medicine:"+(i+1)+"is an Ointment");
			  else if(medicine[i] instanceof CoughSyrup)
				  System.out.println("Medicine:"+(i+1)+"is a Cough syrup");
			  
			  medicine[i].displayLable();
			  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		  }
	}

}
