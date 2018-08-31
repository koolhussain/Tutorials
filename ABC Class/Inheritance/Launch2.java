class You
{
	private int acc_no;
	private int password;

	public You()
	{
		acc_no = 1234;
		password = 2222;
	}

	void disp()
	{
		System.out.println(acc_no);
		System.out.println(password);
	}
}

class Friend extends You
{
	int acc_no;
	int password;

	public Friend()
	{
		acc_no =  2345;
		password = 3333;
	}

	void disp()
	{
		System.out.println(acc_no);
		System.out.println(password);
	}
}

class Launch2
{
	public static void main(String[] args)
	{
		You y = new You();
		Friend f = new Friend();
		y.disp();
		f.disp();
	}
}