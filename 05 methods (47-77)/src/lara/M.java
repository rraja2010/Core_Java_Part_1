package lara;

public class M
{
	static void test()
	{
		System.out.println("test begin");
		if(false)
		{
			System.out.println("from if");
			return;
		}
		System.out.println("test end");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
