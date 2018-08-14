import java.util.Scanner;

class Reverse_no
{
	public static void main(String[] args)
	{
		int no, digit, rev=0, mul=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No to Reverse");
		no = scan.nextInt();
		while(no>0)
		{
			rev = rev * 10;
			digit = no % 10;
			rev = rev + digit;
			no = no / 10;
		}
		System.out.println("The Reverse of the No "+rev);
	}
}