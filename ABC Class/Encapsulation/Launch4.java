class Dog
{
	String name;
	String breed;
	int cost;

	public Dog(String name, String breed, int cost)
	{
		this.name = name;
		this.breed = breed;
		this.cost = cost;
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

class Launch4
{
	public static void main(String[] args)
	{
		Dog d = new Dog("Lobo", "Bull Dog", 987);
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getCost());
	}
}