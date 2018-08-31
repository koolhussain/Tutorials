class Demo1 extends Demo2
{
	void disp1()
	{
		System.out.println("Demo1 Class");
	}
}

class Demo2 extends Demo1
{
	void disp()
	{
		Systemout.println("Demo2 Class");
	}
}

class Launch5
{
	public static void main(String[] args)
	{
		Demo2 d2 = new Demo2();
		d2.disp2();
	}
}