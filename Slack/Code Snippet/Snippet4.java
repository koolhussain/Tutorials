public class Snippet4
{
	static void test(float x)
	{
		System.out.print("float");
	}

	static void test(double x)
	{
		System.out.print("double");
	}

	public static void main(String[] args)
	{
		test(99.9);
	}
}