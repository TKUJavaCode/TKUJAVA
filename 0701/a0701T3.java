import java.util.Scanner;

class mathcal{
	double x;
	double pi=3.14;
	void math(int a){
		x=a*a*pi;
	}
	
	void math(int a,int w,int h){
		x=a*w*h;
	}
	
	void printINFO() {
		System.out.printf("x=%f\n",x);
	}
	
}

public class a0701T3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,w,h;
		System.out.printf("��J��(�b�|) �e ��:\n");
		a=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		mathcal A=new mathcal();
		System.out.printf("�ꭱ�n:");
		A.math(a);
		A.printINFO();
		System.out.printf("������n:");
		A.math(a,w,h);
		A.printINFO();
	}

}
