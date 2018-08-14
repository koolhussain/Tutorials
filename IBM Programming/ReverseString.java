import java.util.Scanner;

class ReverseString
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("ENter a String");
		String str = scan.nextLine();

		char arr[] = new char[str.length()];
		arr = str.toCharArray();

		String temp="";
		for(int i = str.length()-1; i>=0;i--)
		{
			temp = temp + arr[i];
		}
		System.out.println(temp);
	}
}