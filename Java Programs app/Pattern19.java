class Pattern19
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5-i;j++)
			{
				System.out.print((char)(j+65));
			}
			System.out.println();
		}
	}
}