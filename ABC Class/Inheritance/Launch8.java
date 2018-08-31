class Demo1
{
	int a;
	int b;

	public Demo1()
	{
		a = 10;
		b = 20;
	}

	public Demo1(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}

class Demo2 extends Demo1
{
	int c;
	int d;

	public Demo2()
	{
		c = 30;
		d = 40;
	}

	public Demo2(int a, int b, int c, int d)
	{
		super(a,b);
		this.c = c;
		this.d = d;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class Launch8
{
	public static void main(String[] args)
	{
		Demo2 d2 = new Demo2(100,200,300,400);
		d2.disp();
	}
}