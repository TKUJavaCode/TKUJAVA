class ABC{
	public int staffNO=0;
	public String name="�L�W��";
	public int money=0;
	public String belongs="���w";
	ABC(){
		printinfo();
	}
	ABC(int staffNO){
		this.staffNO=staffNO;
		printinfo();
	}
	
	ABC(int staffNO,String name){
		this.staffNO=staffNO;
		this.name=name;
		money=1000;
		belongs="���";
		printinfo();
	}
	
	ABC(int staffNO,String name,String belongs,int money){
		this.staffNO=staffNO;
		this.name=name;
		this.money=money;
		this.belongs=belongs;
		printinfo();
	}
	public void printinfo() {
		System.out.println("���u�s��:"+staffNO);
		System.out.println("�m�W:"+name);
		System.out.println("����:"+belongs);
		System.out.println("�~��:"+money);
		System.out.println();
	}
}

public class a0728T3 {

	public static void main(String[] args) {
		System.out.println("�ǤJ1�ӰѼ�");
		ABC abc1=new ABC(450);
		System.out.println("�ǤJ2�ӰѼ�");
		ABC abc2=new ABC(450,"john");
		System.out.println("�ǤJ4�ӰѼ�");
		ABC abc3=new ABC(450,"john","bus",10000);
		System.out.println("�L�Ѽ�");
		ABC abc4=new ABC();
	}

}
