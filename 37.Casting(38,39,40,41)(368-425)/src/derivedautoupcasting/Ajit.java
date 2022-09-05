package derivedautoupcasting;

class Am{
	public void test1() {
		System.out.println("I am from test1");
	}
	public void test2() {
		System.out.println("I am from test2");
	}
	public void test3() {
		System.out.println("I am from test3");
	}
}

public class Ajit extends Am {
	public static void main(String[] args) {
		Am am = new Ajit();
	//	Ajit aj=new Am();
	}
}

