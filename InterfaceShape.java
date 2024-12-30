
interface shape{
	void getArea();
}
class  Rectangle implements shape{
	public void getArea() {
	int length=10;
	int height=20;
	int a=length*height;
	System.out.println("Area of rectangle is"+a);
	}
}
class Triangle implements shape{
	  public void getArea(){
		  int base =20;
		  int height=10;
		  int triangle=(base*height)/2;
		 System.out.println("Area of triangle is"+triangle);
		
	}
}
class Circle implements shape{
	public void getArea() {
		int pi=6;
		int r=10;
		int radius=pi*r*r;
		System.out.println("Area of the circcle is"+radius);
	}
}
public class InterfaceShape {
	public static void main(String args[]) {
	Rectangle obj=new Rectangle();
	obj.getArea();
	Triangle tobj=new Triangle();
	tobj.getArea();
	Circle cobj=new Circle();
	cobj.getArea();
		
		
		// TODO Auto-generated method stub
		
	}
		
	}


