class customer{
	public static int counter=0;
	public int id;
	public String name;
	/*static {
		counter=0;
	} */
	public customer() {
		id=++counter;//������id+=counter,�ӬOid�h�@����counter+1
	}
	public void output() {
		System.out.printf("id:%d name:%s\n",id,name);
		System.out.printf("�@��:%d�H\n",counter);
	}
	
}


public class a0706T3 {

	public static void main(String[] args) {
		customer t1=new customer();
		t1.name="�p��";
		t1.output();
		customer t2=new customer();
		t2.name="�p��";
		t2.output();

	}

}
