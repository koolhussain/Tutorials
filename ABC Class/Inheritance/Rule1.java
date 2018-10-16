class You{

	private int acc_no;
	private int pwd;


	public You(){
		acc_no = 9999;
		pawd = 7777;
	}
}

class Friend extends You{

	void changeData(){
		acc_no = 9999;
		pwd = 1111;
	}

	void disp(){
		System.out.println(acc_no);
		System.out.println(pwd);
	}
}

class Rule1{
	public static void main(String[] args){
		Friend f = new Friend();
		f.changeData();
		f.disp();
	}
}