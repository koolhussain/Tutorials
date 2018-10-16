class Demo1 extends Demo2{
	void disp1(){
		System.out.println("Demo1");
	}
}

class Demo2 extends Demo1{
	void disp2(){
		System.out.println("Demo2");
	}
}

class Rule5{
	public static void main(String[] args){
		Demo2 d2 = new Demo2();
		d2.disp2();
	}
}