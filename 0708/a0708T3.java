interface shape{//����
	double pi=3.14;//���Ppublic static final double pi=3.14
	double area();//��H��k �᭱������@���M�|����
}

class circle implements shape{//class�~�Ӥ����٤�����@(implements)
	protected double r;
	circle(double r){
		this.r=r;
	}
	
	public double area() {//��@��H��karea
		return r*r*pi;
	}
}

public class a0708T3 {

	public static void main(String[] args) {
		circle c=new circle(2);
		System.out.println("�ꭱ�n:"+c.area());
	}
}
