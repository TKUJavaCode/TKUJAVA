interface shape{//介面
	double pi=3.14;//等同public static final double pi=3.14
	double area();//抽象方法 後面必須實作不然會報錯
}

class circle implements shape{//class繼承介面稱之為實作(implements)
	protected double r;
	circle(double r){
		this.r=r;
	}
	
	public double area() {//實作抽象方法area
		return r*r*pi;
	}
}

public class a0708T3 {

	public static void main(String[] args) {
		circle c=new circle(2);
		System.out.println("圓面積:"+c.area());
	}
}
