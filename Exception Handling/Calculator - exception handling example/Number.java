
public class Number {
	
	private int firstNumber, secondNumber;
	private double result;

	public Number(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public void add() {
		result = firstNumber + secondNumber;
		System.out.println("Sum:"+result);
	}
	
	public void sub() {
		result = firstNumber - secondNumber;
		System.out.println("Difference:"+result);
	}
	
	public void mul() {
		result = firstNumber * secondNumber;
		System.out.println("Product:"+result);
	}
	
	public void div() {
		try {
			result = firstNumber / secondNumber;
			System.out.println("Quotient:"+result);
		}catch(ArithmeticException e) {
			System.out.println("Divisor cannot be zero");
		}

}
}
