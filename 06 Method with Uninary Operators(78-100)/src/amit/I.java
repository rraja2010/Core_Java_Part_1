package amit;

public class I
{
	static void test(boolean flag , int x)
	{
		System.out.println("form test");
		System.out.println("flag");
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		System.out.println("form main");
		test(true, 20);
		System.out.println("''''''''");
		boolean f1 = false;
		test(f1,30);
	}
}
