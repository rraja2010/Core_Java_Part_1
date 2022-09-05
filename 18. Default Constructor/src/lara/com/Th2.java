package lara.com;

public class Th2 {
	Th2() {
		System.out.println("DEFOULT CONSTRUCTOR WIHTOUT PARAMETER");
	}

	Th2(int i) {
		this();
		System.out.println("TH1");
	}

	
	Th2(int i,String name) {
		this(10);
		System.out.println("TH2");
	}
	
	Th2(int i,int age, double salary) {
		this(100,"ajit");
		System.out.println("TH");
	}
	public static void main(String[] args) {
		//Th2 th = new Th2(2);
		Th2 th1 = new Th2(100,32,234.5);
	}
}
