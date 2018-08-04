class Pattern5
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=7;i>=1;i--)
		{
			for(j=7;j>=7-i+1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}