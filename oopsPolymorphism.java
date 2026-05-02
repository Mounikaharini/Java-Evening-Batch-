package Jan_Batch_2026;

class Shape{
	void area() {
		System.out.println("area");
	}
	void perimeter() {
		System.out.println("perimeter");
	}
}
class Sqaure extends Shape{
	@Override
	void area() {
		System.out.println(5*5);
	}
	@Override
	void perimeter() {
		System.out.println(5*4);
	}

}

class Rectangle extends Shape{
	@Override
	void area() {
		System.out.println(5*3);
	}
	@Override
	void perimeter() {
		System.out.println(2*(5+3));
	}
}

class output{
	void display(Shape sh) {
		sh.area();
		sh.perimeter();
	}
}
public class OopsMOverR {

	public static void main(String[] args) {
		
//		Sqaure s = new Sqaure();
//		s.area();
//		s.perimeter();
//		
//		Rectangle r = new Rectangle();
//		r.area();
//		r.perimeter();
		
//		Shape s = new Sqaure();
//		s.area();
//		s.perimeter();
//		
//		Shape r = new Rectangle();
//		r.area();
//		r.perimeter();
		
//		Sqaure s = new Sqaure();	
//		Rectangle r = new Rectangle();
//		
//		Shape sh;
//		
//		sh=s;
//		sh.area();
//		sh.perimeter();
//		
//		sh = r;
//		sh.area();
//		sh.perimeter();
		
		Sqaure s = new Sqaure();	
		Rectangle r = new Rectangle();
		
		output o = new output();
		
		o.display(s);
		o.display(r);
	
	}

}
