package kumar;

public class A
{
	 static int i;  
	// int J;
	public static void main(String[] args)
	{
		System.out.println(A.i);
	}
}
/*if we write only int i; and compile then it gives the error message bz non
static variable i can not be referenced from static context;
//when we create class all static member loaded in the memory but non 
static member loaded in the memory when we
//create the object of that class.
//static bloc executed only ones for each class load.

*/