class Pattern14
{
	public static void main(String[] args)
	{
		int i,j;
		for(i='A';i<='E';i++)
		{
			for(j='A';j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}