package sec;

import first.S1;

interface Q
{
	void test();
}
class R implements Q
{
	public void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) {
		S1 s = new S1();
		s.testAjit("test");
	}
}
//while implementing the interface method public keyword is required.