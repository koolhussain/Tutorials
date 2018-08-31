class Parent{
	public void cry(){
		System.out.println("Parent do not Cry");
	}
}

class Child1 extends Parent{
	public void cry(){
		System.out.println("Child1 cries in Low Voice");
	}
	public void eat(){
		System.out.println("Child eats Less Food");
	}
}

class Child2 extends Parent{
	public void cry(){
		System.out.println("Child2 cries in Medium Voice");
	}
	public void eat(){
		System.out.println("Child2 eats Sufficient Food");
	}
}

class Child3 extends Parent{
	public void cry(){
		System.out.println("Child3 cries in High Voice");
	}
	public void eat(){
		System.out.println("Child3 eats more Food");
	}
}

class Launch4{
	public static void main(String[] args){
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Child3 c3 = new Child3();

		Parent ref;

		ref=c1;
		ref.cry();
		((Child1)(ref)).eat();

		ref=c2;
		ref.cry();
		((Child2)(ref)).eat();

		ref=c3;
		ref.cry();
		((Child3)(ref)).eat();
	}
}