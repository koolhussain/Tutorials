class Book
{
	private int page_no;

	public void setData(int x)
	{
		if(x > 0)
		{
			page_no = x;
		}
		else
		{
			System.out.println("Invalid Page No");
			System.exit(0);
		}
	}

	public int getData()
	{
		return page_no;
	}
}

class Launch1
{
	public static void main(String[] args)
	{
		int page;
		Book bo = new Book();
		bo.setData(100);
		page = bo.getData();
		System.out.println(page);
	}
}