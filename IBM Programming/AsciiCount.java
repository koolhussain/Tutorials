class AsciiCount
{
	public static void main(String[] args)
	{
		String str = "QWERTYUIOPPASDFGHJKLZXCVBNM<>?:!@#$%^&*()1234567890";
		int count_vowels=0;
		int count_nos =0;
		int count_conso =0;
		int count_special=0;
		String temp = "";

		char arr[] = new char[str.length()];
		arr = str.toCharArray();

		for(int i =0;i<str.length();i++)
		{
			if(arr[i] >=65 && arr[i]<=90)
			{	
				arr[i]= (char)(arr[i]+32);
			}
		}
		for(int i =0;i<arr.length;i++)
		{
			temp = temp + arr[i];
		}
		System.out.println(temp);
		for(int i=0;i<temp.length();i++)
		{
			if(temp.charAt(i) == 'a' || temp.charAt(i) == 'e' || temp.charAt(i) == 'i' || temp.charAt(i) == 'o' || temp.charAt(i) == 'u')
			{
				count_vowels++;
			}
			else if(temp.charAt(i)>=97 && temp.charAt(i)<=122)
			{
				count_conso++;
			}
			else if(temp.charAt(i)>=48 && temp.charAt(i)<=57)
			{
				count_nos++;
			}
			else
			{
				count_special++;
			}
		}
		System.out.println(count_vowels);
		System.out.println(count_conso);
		System.out.println(count_nos);
		System.out.println(count_special);
	}
}