class Animal{
	public void eat(){
		System.out.println("Animal eats food");
	}

	public void sleep(){
		System.out.println("Animal sleeps in Home");
	}
}

class Tiger extends Animal{
	public void eat(){
		System.out.println("Tiger hunts are eats it Prey");
	}

	public void foodHabit(){
		System.out.println("Tiger is Carnivorous");
	}
}

class Deer extends Animal{
	public void eat(){
		System.out.println("Deer grazes on the Field");
	}

	public void foodHabit(){
		System.out.println("Deer is Herbivorous");
	}
}

class Monkey extends Animal{
	public void eat(){
		System.out.println("Monkey steals and eats");
	}

	public void foodHabit(){
		System.out.println("Monkey is Omnivorous");
	}
}

class Launch11{
	public static void main(String[] args){
		Tiger t = new Tiger();
		Deer d = new Deer();
		Monkey m = new Monkey();

		t.eat();
		t.foodHabit();
		t.sleep();

		d.eat();
		d.foodHabit();
		d.sleep();

		m.eat();
		m.foodHabit();
		m.sleep();
	}
}