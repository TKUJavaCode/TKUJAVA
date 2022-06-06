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
		System.out.printf("輸入長(半徑) 寬 高:\n");
		a=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		mathcal A=new mathcal();
		System.out.printf("圓面積:");
		A.math(a);
		A.printINFO();
		System.out.printf("長方體積:");
		A.math(a,w,h);
		A.printINFO();
	}

}
