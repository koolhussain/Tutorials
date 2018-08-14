import java.util.StringTokenizer;

class Adding_of_String
{
	public static void main(String[] args)
	{
		int element, sum=0;
		int S = (int)args[0];
		System.out.println(S);
		while(S > 0)
		{	
			element = S%10;
			sum = sum + (int)element;
		}
		System.out.println(sum);

	}
}