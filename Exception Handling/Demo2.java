
public class Demo2 {
	public static void main(String[] args) {
		
		try{
			int[] intArray = {2,4,6,8};
			System.out.println(intArray[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Incorrect array index");
		}catch(Exception e) {                         // generic exception (should always be given last)
			System.out.println("error");
		}
	}

}
