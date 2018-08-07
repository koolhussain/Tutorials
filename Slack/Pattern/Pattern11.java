class Pattern11
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=7;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=7;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(i=6;i>=1;i--)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=7;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}