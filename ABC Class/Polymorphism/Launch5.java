class Plane{
	public void takeOff(){
		System.out.println("Plane is Taking Off");
	}

	public void fly(){
		System.out.println("Plane is Flying");
	}

	public void land(){
		System.out.println("Plane is Landing");
	}
}

class CargoPlane extends Plane{
	public void takeOff(){
		System.out.println("Cargo Plane is taking off on a long runway");
	}

	public void fly(){
		System.out.println("Cargo Plane is Flying at Low Heights");
	}

	public void land(){
		System.out.println("Cargo Plane is landing on a long runway");
	}
}

class PassengerPlane extends Plane{
	public void takeOff(){
		System.out.println("Passenger Plane is taking off on a Medium runway");
	}

	public void fly(){
		System.out.println("Passenger Plane is Flying at Medium Heights");
	}

	public void land(){
		System.out.println("Cargo Plane is landing on a Medium runway");
	}
}

class FighterPlane extends Plane{
	public void takeOff(){
		System.out.println("Fighter Plane is taking off on a short runway");
	}

	public void fly(){
		System.out.println("Fighter Plane is Flying at Great Heights");
	}

	public void land(){
		System.out.println("Fighter Plane is landing on a short runway");
	}
}

class Airport{
	public void permit(Plane ref){
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

class Launch5{
	public static void main(String[] args){
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport a = new Airport();

		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
	}
}