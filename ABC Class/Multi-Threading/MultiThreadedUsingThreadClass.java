import java.util.Scanner;

class Banking extends Thread
{
	public void run()
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Banking Activity Started");
			System.out.println("Enter your Account No");
			int acc = scan.nextInt();
			System.out.println("Enter the Password");
			int pwd = scan.nextInt();
			Thread.sleep(1000);
			System.out.println("Collect your Cash");
			System.out.println("Banking Activity Completed");
		}
		catch (Exception e)
		{
			System.out.println("Banking Activity Intterupted");
		}
	}
}

class NumberPrinting extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Number Printing Activity Started");
			for(int i =1; i<=5; i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
			System.out.println("Number Printing Activity Completed");
		}
		catch (Exception e)
		{
			System.out.println("Number Printing Activity Interupted");
		}
	}
}

class CharacterPrinting extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Character Printing Activity Started");
			for(int i =65; i<=70; i++)
			{
				System.out.println((char)i);
				Thread.sleep(1000);
			}
			System.out.println("Character Printing Activity Completed");	
		}
		catch (Exception e)
		{
			System.out.println("Character Printing Activity Interupted");
		}
	}
}

class MultiThreadedUsingThreadClass 
{
	public static void main(String[] args) 
	{
		Banking ba = new Banking();
		NumberPrinting np = new NumberPrinting();
		CharacterPrinting cp = new CharacterPrinting();
		ba.start();
		np.start();
		cp.start();
	}
}
