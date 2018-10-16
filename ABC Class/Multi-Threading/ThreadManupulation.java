class ThreadManupulation 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		t.setName("ABC");
		t.setPriority(1);
		System.out.println(t);
	}
}
