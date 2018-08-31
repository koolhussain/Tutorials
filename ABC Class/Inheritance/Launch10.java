class Plane
{
	public void takeOff()
	{
		System.out.println("Plane is taking Off");
	}

	public void fly()
	{
		System.out.println("Plane is Flying");
	}

	public void land()
	{
		System.out.println("Plane is Landing");
	}
}

class CargoPlane extends Plane{

	public void fly()
	{
		System.out.println("Cargo Plane is flying at low Heights");
	}

	public void carryCargo()
	{
		System.out.println("Cargo Plane is carrying Cargo");
	}
}

class PassengerPlane extends Plane{

	public void fly()
	{
		System.out.println("Passenger Plane is flying at Medium Heights");
	}

	public void carryPassengers()
	{
		System.out.println("Passenger Plane is carrying Passengers");
	}
}

class FighterPlane extends Plane{

	public void fly()
	{
		System.out.println("Fighter Plane is Flying at great heights");
	}

	public void carryWeapons()
	{
		System.out.println("Fighter Plane is Carrying Weapons");
	}
}

class Launch10{
	public static void main(String[] args){
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();

		cp.takeOff();
		cp.fly();
		cp.carryCargo();
		cp.land();

		pp.takeOff();
		pp.fly();
		pp.carryPassengers();
		pp.land();

		fp.takeOff();
		fp.fly();
		fp.carryWeapons();
		fp.land();
	}
}