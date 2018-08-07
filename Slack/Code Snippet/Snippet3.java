class Snippet3
{
	public static void main(String[] args)
	{
		int x;
		x = 10;
		if(x==10)
		{
			int y = 20;
			System.out.print("x and y: "+x+" "+y);
			y=x*2;
		}
		//Error as y in not initialized outside the if block
		y = 100;
		System.out.print("x and y: "+x+" "+y);
	}
}