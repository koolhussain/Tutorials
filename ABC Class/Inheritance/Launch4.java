class Demo1
{
	void disp1()
	{
		System.out.println("Demo1 Class");
	}
}

class Demo2 extends Demo1
{
	void disp2()
	{
		System.out.println("Demo2 Class");
	}
}

class Demo3 extends Demo2
{
	void disp3()
	{
		System.out.println("Demo3 Class");
	}
}

class Launch4
{
	public static void main(String[] args)
	{
		Demo3 d3 = new Demo3();
		d3.disp1();
		d3.disp2();
		d3.disp3();
	}
}