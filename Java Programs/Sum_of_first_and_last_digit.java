import java.util.Scanner;

class Sum_of_first_and_last_digit
{
	public static void main(String[] args)
	{
		int no, f_digit=0, l_digit=0;
		int i = 0;
		System.out.println("Enter the No");
		Scanner scan = new Scanner(System.in);
		no = scan.nextInt();
		l_digit = no%10;
		while(no>0)
		{
			f_digit = no % 10;
			no = no / 10;
			i++;
		}
		if(i>1)
		{
			System.out.println("The Sum of 1st and Last Digit "+(f_digit+l_digit));	
		}
		else
		{
			System.out.println("There is only one Digit "+l_digit);
		}
		
	}
}