//五 醫院系統
abstract class hospisys{
	private String name;
	private int age;
	private String reason;
	
	hospisys(String name,int age,String reason){
		this.name=name;
		this.age=age;
		this.reason=reason;
	}
	
	abstract void printinfo();
	
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public String getreason() {
		return reason;
	}
	public void agejudge() {
		if(age>50)
			System.out.println("老年(>50)");
		else if(age>=31)
			System.out.println("中年(31~50)");
		else if(age>=21)
			System.out.println("壯年(21~30)");
		else
			System.out.println("青少年(<20)");
	}
}
class sickman extends hospisys{
	sickman(String name,int age,String reason){
		super(name,age,reason);
	}

	@Override
	public void printinfo() {
		System.out.println("病人姓名:"+getname());
		System.out.println("年齡:"+getage());
		System.out.printf("年齡判斷:");
		agejudge();
		System.out.println("病因:"+getreason());
		
	}
}


public class a0713a5 {

	public static void main(String[] args) {
		sickman si=new sickman("John",11,"車禍");
		si.printinfo();
	}

}
