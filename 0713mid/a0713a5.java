//�� ��|�t��
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
			System.out.println("�Ѧ~(>50)");
		else if(age>=31)
			System.out.println("���~(31~50)");
		else if(age>=21)
			System.out.println("���~(21~30)");
		else
			System.out.println("�C�֦~(<20)");
	}
}
class sickman extends hospisys{
	sickman(String name,int age,String reason){
		super(name,age,reason);
	}

	@Override
	public void printinfo() {
		System.out.println("�f�H�m�W:"+getname());
		System.out.println("�~��:"+getage());
		System.out.printf("�~�֧P�_:");
		agejudge();
		System.out.println("�f�]:"+getreason());
		
	}
}


public class a0713a5 {

	public static void main(String[] args) {
		sickman si=new sickman("John",11,"����");
		si.printinfo();
	}

}
