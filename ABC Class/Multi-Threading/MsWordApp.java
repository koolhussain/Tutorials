class MsWord extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(name.equals("TYPE"))
		{
			typing();
		}
		else if(name.equals("AUTOSAVE"))
		{
			autoSave();
		}
		else
		{
			spellCheck();
		}
	}

	public void typing()
	{
		try
		{
			for(int i = 1; i<=5; i++)
			{
				System.out.println("Typing....");
				Thread.sleep(4000);
			}
		}
		catch (Exception e)
		{
			System.out.println("Typing Intterupted");
		}
	}

	public void spellCheck()
	{
		try
		{
			for(int i = 1; i<=5; i++)
			{
				System.out.println("Checking....");
				Thread.sleep(4000);
			}
		}
		catch (Exception e)
		{
			System.out.println("Checking Intterupted");
		}
	}

	public void autoSave()
	{
		try
		{
			for(int i = 1; i<=5; i++)
			{
				System.out.println("Saving....");
				Thread.sleep(4000);
			}
		}
		catch (Exception e)
		{
			System.out.println("Saving Intterupted");
		}
	}
}

class MsWordApp  
{
	public static void main(String[] args) 
	{
		MsWord m1 = new MsWord();
		MsWord m2 = new MsWord();
		MsWord m3 = new MsWord();

		m1.setName("TYPE");
		m2.setName("AUTOSAVE");
		m3.setName("SPELLCHECK");

		m2.setDaemon(true);
		m3.setDaemon(true);

		m2.setPriority(8);
		m3.setPriority(9);

		m1.start();
		m2.start();
		m3.start();
	}
}
