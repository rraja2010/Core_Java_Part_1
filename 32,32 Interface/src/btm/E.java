package btm;

interface  E
{
	void test1();
}
class F
{
	public void test1()
	{
		System.out.println("from F-test1()");
	}
}
class G extends F implements E
{
	//override
	public void test1()
	{
		//super.test1();
		System.out.println("from G- test1()");
	}
	
	public static void main(String[] args)
	{
		G obj = new G();
		obj.test1();
		System.out.println("done");
	}
}