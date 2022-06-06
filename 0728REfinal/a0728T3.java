class ABC{
	public int staffNO=0;
	public String name="礚ん";
	public int money=0;
	public String belongs="ゼ﹚";
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
		belongs="对";
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
		System.out.println("絪腹:"+staffNO);
		System.out.println("﹎:"+name);
		System.out.println("场:"+belongs);
		System.out.println("羱:"+money);
		System.out.println();
	}
}

public class a0728T3 {

	public static void main(String[] args) {
		System.out.println("肚1把计");
		ABC abc1=new ABC(450);
		System.out.println("肚2把计");
		ABC abc2=new ABC(450,"john");
		System.out.println("肚4把计");
		ABC abc3=new ABC(450,"john","bus",10000);
		System.out.println("礚把计");
		ABC abc4=new ABC();
	}

}
