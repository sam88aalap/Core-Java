
public class TestRectangle {

	public static void main(String args[]) {
		
		Rectangle obj1 = new Rectangle();
		Rectangle obj2 = new Rectangle(2,4);
		Rectangle obj3 = new Rectangle(6,8);
		Rectangle obj4 = new Rectangle(10,12);
		Rectangle obj5 = new Rectangle(14,16);
		
		System.out.println("___________Rectangle 1_________");
		obj1.getArea();
		obj1.rectangleInfo();
		
		System.out.println("___________Rectangle 2_________");
		obj2.getArea();
		obj2.rectangleInfo();
		
		System.out.println("___________Rectangle 3_________");
		obj3.getArea();
		obj3.rectangleInfo();
		
		System.out.println("___________Rectangle 4_________");
		obj4.getArea();
		obj4.rectangleInfo();
		
		System.out.println("___________Rectangle 5_________");
		obj5.getArea();
		obj5.rectangleInfo();
	}
}
