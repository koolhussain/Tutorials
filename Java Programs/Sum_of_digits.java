import java.util.Scanner;

class Sum_of_digits
{
	public static void main(String[] args)
	{
		int no, digit, sum=0;
		Scanner scan = new Scanner(System.in);
		no = scan.nextInt();

		while(no>0)
		{
			digit = no % 10;
			sum = sum + digit;
			no = no / 10;
		}
		System.out.println("Sum of the Digits "+sum);
	}
}