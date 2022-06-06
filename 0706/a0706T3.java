class customer{
	public static int counter=0;
	public int id;
	public String name;
	/*static {
		counter=0;
	} */
	public customer() {
		id=++counter;//不等於id+=counter,而是id多一筆時counter+1
	}
	public void output() {
		System.out.printf("id:%d name:%s\n",id,name);
		System.out.printf("共有:%d人\n",counter);
	}
	
}


public class a0706T3 {

	public static void main(String[] args) {
		customer t1=new customer();
		t1.name="小明";
		t1.output();
		customer t2=new customer();
		t2.name="小華";
		t2.output();

	}

}
