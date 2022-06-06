import java.util.Scanner;
class math{
	int a=10;
	int b,c;
	void math(int a) {
		b=a;
		c=this.a;
	}
	
	void printINFO() {
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
	
}
public class a0701T4 {

	public static void main(String[] args) {
		math my=new math();
		my.math(3);
		my.printINFO();

	}

}
