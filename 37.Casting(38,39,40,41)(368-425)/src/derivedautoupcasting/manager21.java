//415
package derivedautoupcasting;

class Manager21
{
	static C test()
	{
		A a1=new D();//3step upcasting
		return (C)a1;//proper
	}

	public static void main(String[] args) 
	{
		D d1=(D)test();//proper
	  System.out.println("done");
	}
}
