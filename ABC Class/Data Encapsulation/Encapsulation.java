class Book{
	private int page_no;

	public void setData(int page_no){
		if(page_no > 0){
			this.page_no = page_no;	
		}else{
			System.out.println("Invalid Input");
			System.exit(0);
		}
	}

	public int getData(){
		return page_no;
	}
}

class Encapsulation{
	public static void main(String[] args){
		Book bo = new Book();
		//bo.page_no = 100;   Encapsulation.java:21: error: page_no has private access in Book
		//System.out.println(bo.page_no);  Encapsulation.java:22: error: page_no has private access in Book
		bo.setData(100);
		System.out.println(bo.getData());
	}
}