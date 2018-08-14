class DuplicateElements
{
	public static void main(String[] args)
	{
		int i;
		String s = "qwertyuiopqwertyuiopa";
	
		char arr[] = new char[s.length()];
		arr = s.toCharArray();

		for(i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(arr[i]>arr[j])
				{
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		String temp = "";
		for(i=0;i<arr.length;i++)
		{
			temp = temp + arr[i];
		}

		String dupli="";
		for(i=0;i<temp.length()-1;i++)
		{
			if (temp.charAt(i)!=temp.charAt(i+1))
			{
				dupli+=temp.charAt(i);
			}
		}
		dupli+=temp.charAt(i);

		System.out.println(dupli);

	}
}