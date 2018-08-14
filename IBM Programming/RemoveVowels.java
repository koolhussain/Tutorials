import java.util.Scanner;
class RemoveVowels
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Sentence");
		String str = scan.nextLine();
		String temp = "";
		for(int i =0;i<str.length();i++)
		{
			if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U')
			{
				temp += str.charAt(i);
			}
		}
		System.out.println(temp);
	}
}