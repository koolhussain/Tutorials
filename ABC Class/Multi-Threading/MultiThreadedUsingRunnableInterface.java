import java.util.Scanner;

class Banking implements Runnable
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

class NumberPrinting implements Runnable
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

class CharacterPrinting implements Runnable
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

class MultiThreadedUsingRunnableInterface 
{
	public static void main(String[] args) throws Exception
	{
		Banking ba = new Banking();
		NumberPrinting np = new NumberPrinting();
		CharacterPrinting cp = new CharacterPrinting();

		Thread t1 = new Thread(ba);
		Thread t2 = new Thread(np);
		Thread t3 = new Thread(cp);

		t1.start();
		t2.start();
		t3.start();

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());

		t1.join();
		t2.join();
		t3.join();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
	}
}
