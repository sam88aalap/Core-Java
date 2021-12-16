
public class User {
	private int age;

	public int getAge() {
		return age;
	}

	// called code
	public void setAge(int age) throws AgeException, Exception, SeniorCException {
		if(age<18) {
			
			throw new AgeException();
			
		}
		
		else if(age>65) {
			
			throw new SeniorCException();
		}
		this.age = age;
	}
	
	//calling code
	public static void main(String[] args)  {
		User user = new User();
		try {
			user.setAge(67);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SeniorCException e){
			e.printStackTrace();
			
		}catch(Exception e) {
			System.out.println("error");
		}
			
			System.out.println("age is:" + user.getAge());
		}
		
	}


