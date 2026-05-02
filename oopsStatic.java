package Jan_Batch_2026;
class Test{
	
	static int a,b;
	
	int c,d;
	
	static {
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	static void fun1() {
		System.out.println("static method");
		System.out.println(a);
		System.out.println(b);
	}
	void fun2() {
		System.out.println("instance method");
	}
}

public class staticTheory {

	public static void main(String[] args) {
		
		Test t = new Test();
		t.fun1();
		t.fun2();

	}

}
