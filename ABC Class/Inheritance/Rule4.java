class Demo1{
	void disp1(){
		System.out.println("OAR");
	}
}

class Demo2 extends Demo1{
	void disp2(){
		System.out.println("VIJ");
	}
}

class Demo3 extends Demo2{
	void disp3(){
		System.out.println("BTM");
	}
}

class Rule4{
	public static void main(String[] args){
		Demo3 d =new Demo3();
		d.disp1();
		d.disp2();
		d.disp3();

	}
}