//180
package amit.kumar;

class Tenth{
	String studentName;
	int rollNo;
	String color;
	String address;
	int mobino;
	
	public Tenth(String studentName, int rollNo, String color, String address, int mobino) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.color = color;
		this.address = address;
		this.mobino = mobino;
	}
	
	public static void main(String[] args) {
		Tenth tenth = new Tenth("Ajit", 1011, "Gora", "Ranch", 1234);
	}
	
	
	
}

class A
{
	A()
	{
		System.out.println("A()");
	}

	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("done");
	}
}

 /*
 constructor should have the same name as class name
 it should not have the return type
 constructor will be called automatically while the object
  is creating.
  is is used to initialed the object.
 */