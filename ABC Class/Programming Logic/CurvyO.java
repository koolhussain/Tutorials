import java.util.Scanner;
class CurvyO
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
				if(((j==0 || j==n/2) && (i!=0 && i!=n-1)) || (i==0 || i==n-1) && j>0 && j<n/2)
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
