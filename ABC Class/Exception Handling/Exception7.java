import java.util.Scanner;

class Demo
{
	public void alpha()
	{
		System.out.println("Connection 2 is Established");
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("Enter the Numerator");
			int a = scan.nextInt();
			System.out.println("Enter the Denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println("Exception is inside alpha()");
		}
		System.out.println("Connection 2 is Terminated");
	}
}

class Exception7 
{
	public static void main(String[] args) 
	{
		System.out.println("Connection 1 is Established");
		Demo d = new Demo();
		d.alpha();
		System.out.println("Connection 1 is Terminated");
	}
}
