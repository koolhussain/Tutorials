class Parent{
	public void cry(){
		System.out.println("Parents don't Cry");
	}
}

class Child1 extends Parent{
	public void cry(){
		System.out.println("Child1 cries in Low Voice");
	}
}

class Child2 extends Parent{
	public void cry(){
		System.out.println("Child2 cries in Medium Voice");
	}
}

class Child3 extends Parent{
	public void cry(){
		System.out.println("Child3 cries in High Voice");
	}
}

class Launch1{
	public static void main(String[] args){
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Child3 c3 = new Child3();

		c1.cry();
		c2.cry();
		c3.cry();
	}
}