class You{

	private int acc_no;
	private int pwd;

	public You(){
		acc_no = 9999;
		pwd = 7777;
	}

	void display()
	{
		System.out.println(acc_no);
		System.out.println(pwd);
	}

}

class Friend extends You{

}

class Rule2{
	public static void main(String[] args){
		Friend f = new Friend();
		f.display();
	}
}