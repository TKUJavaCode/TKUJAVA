
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
		System.out.println("車型:"+carshape+"車價:"+carprice+"出廠年份:"+producedate);
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
		System.out.println("車型:"+carshape+"車價:"+carprice+"出廠年份:"+producedate);
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
		System.out.println("車型:"+carshape+"車價:"+carprice+"出廠年份:"+producedate);	
	}
	
}

public class a0708T1 {

	public static void main(String[] args) {
		nissan ni=new nissan("4人座 ",30000,2018);
		BMW bmw=new BMW("6人座 ",400000,2012);
		toyota to=new toyota("7人座 ",500000,2010);
	}

}
