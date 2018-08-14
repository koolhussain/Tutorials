import java.util.Scanner;

class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No of Array Elements");
		int n = scan.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the "+n+" ELements");
		for(int i =0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}

		for(int i =0;i<n-1;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}


		System.out.println("Enter the Sorted Array");
		for(int i =0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}