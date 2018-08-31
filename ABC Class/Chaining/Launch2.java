class Dog
{
	private String name;
	private String breed;
	private int cost;

	public Dog(String name, String breed, int cost)
	{
		this();
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

class Launch2
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog("Lobo", "Bull Dog", 999);
		System.out.println(d1.getName());
		System.out.println(d1.getBreed());
		System.out.println(d1.getCost());

		Dog d2 = new Dog();
		System.out.println(d2.getName());
		System.out.println(d2.getBreed());
		System.out.println(d2.getCost());
	}
}