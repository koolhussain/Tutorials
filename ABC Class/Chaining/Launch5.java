import java.util.Scanner;

class Farmer
{
	private float si;
	private float p;
	private float t;
	static private float r;

	static
	{
		r = 2.5f;
	}
	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Principel Amount");
		p = scan.nextFloat();

		System.out.println("Enter the Time Period");
		t = scan.nextFloat();
	}

	public void computeSI()
	{
		si = (p*r*t)/100;
	}

	public void disp()
	{
		System.out.println(si);
	}
}

class Launch5
{
	public static void main(String[] args)
	{
		Farmer f = new Farmer();
		f.acceptInput();
		f.computeSI();
		f.disp();
	}
}