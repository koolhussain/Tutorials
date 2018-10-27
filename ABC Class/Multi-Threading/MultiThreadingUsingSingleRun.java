import java.util.Scanner;

class Job extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(name.equals("BANK"))
		{
			banking();
		}
		else if(name.equals("NUM"))
		{
			printNum();
		}
		else
		{
			printChar();
		}
	}

	public void banking()
	{
		int acc, pwd;
		System.out.println("Banking Activity Started");
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Acount No");
			acc = scan.nextInt();
			System.out.println("Enter the Password");
			pwd = scan.nextInt();
			Thread.sleep(4000);
			System.out.println("Collect your Cash");
			System.out.println("Banking Activity Completed");	
		}
		catch (Exception e)
		{
			System.out.println("Banking Activity Intterupted");
		}
	}

	public void printNum()
	{
		System.out.println("Printing Number Activity Started");
		try
		{
			for(int i = 1; i<=5; i++)
			{
				System.out.println(i);
				Thread.sleep(4000);
			}
			System.out.println("Printing Number Activity Completed");
		}
		catch (Exception e)
		{
			System.out.println("Printing Number Activity Intterupted");
		}
	}

	public void printChar()
	{
		System.out.println("Printing Character Activity Started");
		try
		{
			for(int i = 65; i<=70; i++)
			{
				System.out.println((char)i);
				Thread.sleep(4000);
			}
			System.out.println("Printing Character Activity Completed");
		}
		catch (Exception e)
		{
			System.out.println("Printing Character Activity Intterupted");
		}
	}
}

class MultiThreadingUsingSingleRun 
{
	public static void main(String[] args) 
	{
		Job j1 = new Job();
		Job j2 = new Job();
		Job j3 = new Job();

		j1.setName("BANK");
		j2.setName("NUM");
		j3.setName("CHAR");

		j1.start();
		j2.start();
		j3.start();
	}
}
