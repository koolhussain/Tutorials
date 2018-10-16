class Demo1
{
	int i = 9;
}

class Demo2
{
	int i = 99;
}

class Demo3 extends Demo1, Demo2{
	void display(){
		System.out.println(i);
	}
}

class Rule3{
	public static void main(String[] args){
		Demo3 d3 = new Demo3();
		d3.display();
	}
}