import java.util.Scanner;
class Exception1 
{
	public static void main(String[] args) 
	{
		System.out.println("Connection is Established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int a = scan.nextInt();
		System.out.println("Enter the Denominator");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Connection is Terminated");
	}
}
