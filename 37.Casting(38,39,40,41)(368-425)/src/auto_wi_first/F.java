package auto_wi_first;

public class F
{
	static double test()
	{
		int i = 10;
		//return i;
		return (double)i;
		//before returning i is converted into double type because test() return type is double
	}
	public static void main(String[] args)
	{
		System.out.println(test());
	
		System.out.println("done");
	}
}
