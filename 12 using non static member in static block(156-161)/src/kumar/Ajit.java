package kumar;

public class Ajit {
	static int age =20;
	int mobileNo = 123456;
	
	public static void staticMethod() {
		System.out.println(age);
		//System.out.println(mobileNo);
		//nonStatic();
	}
	
	public void nonStatic() {
		System.out.println(age);
		System.out.println(mobileNo);
		staticMethod();
	}
	
	public static void main(String[] args) {
		System.out.println(age);
		staticMethod();
		Ajit x = new  Ajit();
		System.out.println(x.mobileNo);
		x.nonStatic();
	}
	
	
}
