class Demo1
{
	int i = 9;
}

class Demo2 extends Demo1
{
	int i = 99;

	void disp()
	{
		System.out.println("Super Class i: "+super.i);
		System.out.println("Super Class i: "+i);
	}
}


class Launch9
{
	public static void main(String[] args)
	{
		Demo2 d2 = new Demo2();
		d2.disp();
	}
}