package lara;

public class G
{
	static void test1()
	{
		System.out.println("from test1");
	}
	static void test2()
	{
		System.out.println("test2 begin");
		test1();
		System.out.println("test2 end");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test1();
		test2();
		System.out.println("main end");
	}
	
}
