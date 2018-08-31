class You
{
	private int acc_num;
	private int password;

	public You()
	{
		acc_num	= 1234;
		password = 9999;
	}
}

class Friend extends You
{
	void chnageData()
	{
		acc_num = 2222;
		password = 8888;
	}

	void disp()
	{
		System.out.println(acc_num);
		System.out.println(password);
	}
}

class Launch1
{
	public static void main(String[] args)
	{
		Friend f = new Friend();
		f.chnageData();
		f.disp();
	}
}