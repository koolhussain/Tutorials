class Dog
{
	private String name;
	private String breed;
	private int cost;

	public void setData(String x, String y, int z)
	{
		name = x;
		breed = y;
		cost = z;
	}

	public String getName()
	{
		return name;
	}

	public String getBreed()
	{
		return breed;
	}

	public int getCost()
	{
		return cost;
	}
}

class Launch2
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.setData("Lobo", "Bull Dog", 9999);

		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getCost());
	}
}