import java.util.Scanner;
class StringLowercase
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Word");
		String str = scan.next();

		char arr[] = new char[str.length()];
		arr = str.toCharArray();

		for(int i =0;i<str.length();i++)
		{
			if(arr[i]>=65 && arr[i]<=90)
			{
				arr[i] = (char)(arr[i]+32);
			}
		}
		System.out.println("The word in Lowercase");
		String temp = "";
		for(int i =0;i<arr.length;i++)
		{
			temp = temp + arr[i];
		}
		System.out.println(temp);
	}
}