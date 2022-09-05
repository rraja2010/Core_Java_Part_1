package lara;

public class D
{
	static int i;
	static
	{
		System.out.println("i->"+i);
		i = 2;
	}

	public static void main(String[] args)
	{
		System.out.println(i);
	}

}
/*
first of all gsv i is initialized with default value zero
then inside sib i value is getting modified with 2


*/