import java.util.Scanner;
class Exception3 
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

			System.out.println("Enter the Array Size");
			int size = scan.nextInt();
			int[] x = new int[size];
			System.out.println("Enter the Element to be Stored");
			int elem = scan.nextInt();
			System.out.println("Enter the Position at which the element is to be stored");
			int pos = scan.nextInt();
			x[pos] = elem;
			System.out.println(x[pos]);
		}
		catch (Exception e)
		{
			System.out.println("Some Problem Occured");
		}
		System.out.println("Connection is Terminated");
	}
}
