import java.util.Scanner;
class FarmerInfo{

	private float si;
	private float p;
	private static float r;
	private float t;

	static{
		r = 2.5f;
	}

	public void AcceptInput(){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Principle Amount");
		p = scan.nextFloat();

		System.out.println("Enter the Time");
		t = scan.nextFloat();
	}

	public void compute(){
		si = (p*r*t)/100;
	}

	public void display(){
		System.out.println("Simple Intrest "+si);
	}
}

class Farmer{
	public static void main(String[] args){
		FarmerInfo f = new FarmerInfo();
		f.AcceptInput();
		f.compute();
		f.display();
	}
}