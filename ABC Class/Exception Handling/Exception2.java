import java.util.Scanner;
class Exception2 
{
	public static void main(String[] args) 
	{
		System.out.println("Connection is Established");
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
			System.out.println("Enter Valid Input");
		}
		System.out.println("Connection is Terminated");
	}
}
