class Dog
{
	private String name;
	private String breed;
	private int cost;

	public Dog(String name, String breed, int cost)
	{
		this(name);
	}

	public Dog(String name)
	{
		this();
		this.name = name;
	}

	public Dog()
	{
		name = "Rocky";
		breed = "Pug";
		cost = 777;
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

class Launch3
{
	public static void main(String[] args)
	{
		Dog d = new Dog("Lobo", "Bull Dog", 999);
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getCost());
	}
}