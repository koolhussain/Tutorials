import java.util.Scanner;
class ExtractWords
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ' )
			{
				count++;
			}
			
		}
		//System.out.println(count);
		String arr[] = new String[count];
		
		String temp = "";
		int j = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' ')
			{
				temp+=str.charAt(i);
			}
			else
			{
				arr[j] = temp;
				j++;
				temp="";
			}
		}
		arr[j] = temp;

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
}