import java.util.Scanner;
class Anagram
{
	public static void main(String[] args)
	{
		String s1 = "MOTHER IN LAW";
		String s2 = "HITLER WOMAN";

		s1 = removeSpace(s1);
		s2 = removeSpace(s2);

		System.out.println(s1);
		System.out.println(s2);

		if(s1.length() == s2.length())
		{
			s1 = lowerCase(s1);
			s2 = lowerCase(s2);


			System.out.println(s1);
			System.out.println(s2);

			s1 = sort(s1);
			s2 = sort(s2);


			System.out.println(s1);
			System.out.println(s2);

			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i) == s2.charAt(i))
				{
					count++;
				}
			}
			if(count == s1.length())
			{
				System.out.println("ANAGRAM");
			}
			else
			{
				System.out.println("NOT ANAGRAM");
			}
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

	private static String removeSpace(String s)
	{
		String temp = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			{
				temp += s.charAt(i);
			}
		}
		return temp;
	}

	private static String lowerCase(String s)
	{
		String temp = "";
		char arr[] = new char[s.length()];
		arr = s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] >=65 && arr[i] <=90)
			{
				arr[i] = (char)(arr[i] + 32);
			}
		}
		for(int i = 0;i<arr.length;i++)
		{
			temp+=arr[i];
		}
		return temp;
	}

	private static String sort(String s)
	{
		String temp = "";
		char arr[] = new char[s.length()];
		arr = s.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					char p = arr[i];
					arr[i] = arr[j];
					arr[j] = p;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			temp+=arr[i];
		}
		return temp;
	}
}