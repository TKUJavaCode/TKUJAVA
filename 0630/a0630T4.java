import java.util.Scanner;
public class a0630T4 {

	public static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return (n*factorial(n-1));
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("¿é¤J¶¥¼h:\n");
		int num=sc.nextInt();
		System.out.printf("The factorial result is of %d is %d\n",num,factorial(num));
	}

}
