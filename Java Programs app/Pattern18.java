class Pattern18
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print((char)(i+65));
			}
			System.out.println();
		}
	}
}