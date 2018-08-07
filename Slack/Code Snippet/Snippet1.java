class Snippet1
{
	public static void main(String[] args)
	{
		byte b;
		int i =258;
		double d = 325.59;

		b = (byte)i;
		//Rollover takes place
		//0-127 = 127 values 
		//-128 - -1 = 128 values
		//255 + 0th value = 256 values
		//258-256 = 2
		//Output = 2
		System.out.println(b);

		i = (int)d;
		//Removes the values after decimal point
		//Output = 325
		System.out.println(i);

		b = (byte)d;
		//As byte stores integral values 325.59 becomes 325
		//convert 325 to binary values which equals to 69 when stored in 1 byte
		System.out.println(b);
	}
}