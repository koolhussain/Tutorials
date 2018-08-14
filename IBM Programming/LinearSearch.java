import java.util.Scanner;

class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No of Elements of the Array");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter the Elemet to be Found");
		int find = scan.nextInt();

		for(int i=0;i<n;i++)
		{
			if(arr[i] == find)
			{
				System.out.println("Found at "+(i+1));
			}
		}
	}
}