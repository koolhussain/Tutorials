class Pattern22
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((char)(i+65-1));
			}
			System.out.println();
		}
	}
}