public class Snippet2
{
	public static void main(String[] args)
	{
		byte b = 127;
		b++;
		b++;
		//Rollover takes place and value printed is -127
		System.out.println(b);
	}
}