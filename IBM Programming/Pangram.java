class Pangram
{
	public static void main(String[] args)
	{
		String s = "The QUick BROwn Fox Jumps over the Lazy Dog";

		s = removeSpace(s);

		System.out.println(s);

		if(s.length() < 26)
		{
			System.out.println("Not Pangram");
		}
		else
		{
			s = lowerCase(s);
			System.out.println(s);

			s = sort(s);
			System.out.println(s);

			s = removeDuplicate(s);
			System.out.println(s);
		}
	}

	private static String removeSpace(String s)
	{
		String temp = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) !=' ')
			{
				temp+=s.charAt(i);
			}
		}
		return temp;
	}

	private static String lowerCase(String s)
	{
		String temp = "";
		char arr[] = new char[s.length()];
		arr = s.toCharArray();
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] >=65 && arr[i]<=90)
			{
				arr[i] = (char)(arr[i]+32);
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			temp+=arr[i];
		}
		return temp;
	}

	private static String sort(String s)
	{
		String temp="";
		char arr[] = new char[s.length()];
		arr = s.toCharArray();

		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char p = arr[i];
					arr[i] = arr[j];
					arr[j] = p;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			temp += arr[i];
		}
		return temp;
	}

	private static String removeDuplicate(String s)
	{
		String temp = "";
		int i;
		for(i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i) != s.charAt(i+1))
			{
				temp+=s.charAt(i);
			}
		}
		temp+=s.charAt(i);
		return temp;
	}
}