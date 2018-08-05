class Pattern13
{
	public static void main(String[] args)
	{
		int i,j;
		for(i='A';i<='E';i++)
		{
			for(j='A';j<=i;j++)
			{
				System.out.print((char)i);
			}
			System.out.println();
		}
	}
}