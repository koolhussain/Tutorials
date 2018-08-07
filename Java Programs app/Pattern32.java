class Pattern32
{
	public static void main(String[] args)
	{
		int i,j,k;
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print((char)(i+65-1));
			}
			System.out.println();
		}
	}
}