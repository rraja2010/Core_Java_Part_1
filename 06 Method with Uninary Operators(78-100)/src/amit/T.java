package amit;

public class T
{
	static int test(int i )
	{
		return i++;
	}
	public static void main(String[] args)
	{
		int i = 0;
		System.out.println(i);
		i = test(i++);
		System.out.println(i);
	}
}
