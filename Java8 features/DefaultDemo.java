
public interface DefaultDemo {
	
	abstract void method1();
	static void method3() {
		System.out.println("This is static method");
	}
	default void method2() {
		System.out.println("This is default method");
	}

}
