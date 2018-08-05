class Pattern23
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print((char)(j+65-1));
			}
			System.out.println();
		}
	}
}