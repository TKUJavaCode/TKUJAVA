import java.util.Scanner;

class SimpleMath{
	int x,y;
	SimpleMath(int a,int b){
		x=a;
		y=b;
	}
	void add() {
		System.out.printf("%d+%d=%d\n",x,y,x+y);
	}
	
	void minus() {
		System.out.printf("%d-%d=%d\n",x,y,x-y);
	}
	
	void mux() {
		System.out.printf("%d*%d=%d\n",x,y,x*y);
	}
	
	void divide() {
		System.out.printf("%d/%d=%d\n",x,y,x/y);
	}
}

public class a0701T1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("¿é¤J2¼Æ¦r\n");
		SimpleMath A=new SimpleMath(sc.nextInt(),sc.nextInt());
		A.add();
		A.minus();
		A.mux();
		A.divide();

	}

}
