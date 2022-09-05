package first;

public class S1
{
	void test()
	{
		System.out.println("from S");
	}
	public String testAjit(String str) {
		return str;
	}
}
class T1 extends S1
{
	void test()
	{
		System.out.println("from amit");
	}
	public static void main(String[] args)
	{
		T1 t1 = new T1();
		t1.test();
		System.out.println("done");
	}
}
