import java.util.Scanner;
class CurvyJ
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No of Rows");
		int n = scan.nextInt();
		for(int i =0; i<n;i++)
		{
			for(int j =0; j<n ; j++)
			{
				if(i==0 || j==n/2 || (i==n-1 && j<n/2) || (j==0 && i>n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
