package amit;

public class X
{
	static int test(int i)
	{
		return i++;
	}
	public static void main(String[] args)
	{
		int i = 0;
		int j = i++ + i + test(i++) +  ++i + test(i++) + i
				+ --i + test(--i) + i + i + test(i--) + ++i ; 
		System.out.println(i);
		System.out.println(j);
	}
}
