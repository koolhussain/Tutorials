class Demo
{
	public Demo()
	{
		System.out.println("Inside Constructor");
	}

	{
		System.out.println("Non Static Block1");
	}

	{
		System.out.println("Non Static Block2");
	}

}

class Launch7
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
	}
}