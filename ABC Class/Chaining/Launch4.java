class Demo
{
	static int a,b,c;

	static
	{
		a = 10;
		b = 20;
		c = 30;
	}

	static void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	int x,y,z;

	{
		a = 100;
		b = 200;
		c = 300;
		x = 400;
		y = 500;
		z = 600;
	}

	void disp2()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

class Launch4
{
	public static void main(String[] args)
	{
		Demo.disp();

		Demo d = new Demo();

		d.disp2();
	}
}