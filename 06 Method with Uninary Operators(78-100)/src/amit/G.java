package amit;

public class G
{
	static void test(int i)
	{
		System.out.println("test:" + i++);
	}
	public static void main(String[] args)
	{
		int i = 10;
		test(i);
		System.out.println("main: "+ i);
	}
}
