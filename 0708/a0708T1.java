
abstract class car{
	String carshape;
	int carprice;
	int producedate;
	abstract void demo();
	
}

class nissan extends car{
	nissan(String carshape,int carprice,int producedate){
		this.carshape=carshape;
		this.carprice=carprice;
		this.producedate=producedate;
		System.out.println("nissan");
		demo();
	}
	
	public void demo() {
		System.out.println("����:"+carshape+"����:"+carprice+"�X�t�~��:"+producedate);
	}
	
	
}

class BMW extends car{
	BMW(String carshape,int carprice,int producedate){
		this.carshape=carshape;
		this.carprice=carprice;
		this.producedate=producedate;
		System.out.println("BMW");
		demo();
	}
	public void demo() {
		System.out.println("����:"+carshape+"����:"+carprice+"�X�t�~��:"+producedate);
	}
	
}

class toyota extends car{
	toyota(String carshape,int carprice,int producedate){
		this.carshape=carshape;
		this.carprice=carprice;
		this.producedate=producedate;
		System.out.println("toyota");
		demo();
	}
	public void demo() {
		System.out.println("����:"+carshape+"����:"+carprice+"�X�t�~��:"+producedate);	
	}
	
}

public class a0708T1 {

	public static void main(String[] args) {
		nissan ni=new nissan("4�H�y ",30000,2018);
		BMW bmw=new BMW("6�H�y ",400000,2012);
		toyota to=new toyota("7�H�y ",500000,2010);
	}

}
