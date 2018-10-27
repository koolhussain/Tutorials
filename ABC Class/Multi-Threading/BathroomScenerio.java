class Bathroom implements Runnable
{
	synchronized public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		try
		{
			System.out.println(name+" has entered the Bathroom");
			Thread.sleep(5000);
			System.out.println(name+" has entered the Bathroom");
			Thread.sleep(5000);
			System.out.println(name+" has entered the Bathroom");
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
			System.out.println("Bathroon Activity Intterupted");
		}
	}
}

class BathroomScenerio 
{
	public static void main(String[] args) 
	{
		Bathroom b = new Bathroom();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);

		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("OTHER");

		t1.start();
		t2.start();
		t3.start();
	}
}
