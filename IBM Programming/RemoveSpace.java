import java.util.Scanner;

class RemoveSpace
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = scan.nextLine();

		String temp="";

		for(int i =0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				temp += str.charAt(i);
			}
		}
		System.out.println(temp);
	}
}