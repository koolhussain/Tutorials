class Pattern7
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=7;i>=1;i--)
		{
			for(j=7;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}