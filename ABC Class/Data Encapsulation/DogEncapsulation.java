class Dog{
	private String name;
	private String breed;
	private int cost;

	public void setData(String name, String breed, int cost){
		this.name = name;
		this.breed = breed;
		this.cost = cost;
	}

	public String getName(){
		return name;
	}

	public String getBreed(){
		return breed;
	}

	public int getCost(){
		return cost;
	}
}

class DogEncapsulation{
	public static void main(String[] args){
		Dog d = new Dog();
		d.setData("Lobo", "Bull Dog", 999);
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getCost());
	}
}