
class TaipeiBank{
	private String name;
	protected int balance;//private cant use
	TaipeiBank(String name){
		this.name=name;
		this.balance=0;
	}
	public void saveMoney(int money) {
		System.out.println(name+"current money:"+balance);
		this.balance+=money;
	}
	
public void withdrawMoney(int money) {
		System.out.println(name+"current money:"+balance);
		this.balance-=money;
	}
	
	
	
	void getBalance() {
		System.out.println(name+"current money:"+balance);
	}
}

public class a0706T1 {

	public static void main(String[] args) {
		TaipeiBank A=new TaipeiBank("小明");
		A.getBalance();
		System.out.println("設定初始10000");
		A.balance=10000;
		A.withdrawMoney(3000);
		System.out.println("提3000");
		A.saveMoney(2000);
		System.out.println("存2000");
		A.getBalance();

	}

}
