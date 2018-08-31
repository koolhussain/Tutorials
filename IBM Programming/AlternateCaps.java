
import java.util.Scanner;
class AlternateCaps
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		char arr[] = new char[str.length()];
		arr = str.toCharArray();

		int z =2;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] != ' ')
			{
				if(arr[i] >=97 && arr[i] <=122 && z%2==0)
				{
					arr[i] = (char)(arr[i]-32);
					z++;
				}
				else
				{
					z--;
				}
			}
		}
		String temp = "";
		for(int i =0;i<arr.length;i++)
		{
			temp+=arr[i];
		}

		System.out.println(temp);
	}
}