class Demo{

	static int a, b, c;

	static{
		a = 10;
		b = 20;
		c = 30;
	}

	static void display1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	int x,y,z;

	{
		x = 100;
		y = 200;
		z = 300;
		a = 400;
		b = 500;
		c = 600;
	}

	void display(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}

class StaticIntro{
	public static void main(String[] args){
		Demo.display1();
		Demo d = new Demo();
		d.display();
	}
}