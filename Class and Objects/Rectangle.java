
public class Rectangle {
  private int length;
  private int bredth;
  
  public Rectangle() {
	  this.length=0;
	  this.bredth=0;
  }
  
  public Rectangle(int length, int bredth) {
	  this.length=length;
	  this.bredth=bredth;
  }

public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public int getBredth() {
	return bredth;
}

public void setBredth(int bredth) {
	this.bredth = bredth;
}
  
public void getArea() {
	int area=this.length*this.bredth;
	System.out.println("Area:"+ area +" m2");
}

public void rectangleInfo() {
	System.out.println("Dimensions:"+length+" X "+bredth);
}

}

