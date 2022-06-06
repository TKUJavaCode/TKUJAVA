import java.util.Scanner;

public class a0630T1 {

	public static void main(String[] args) {
		final int pwd=70;
		int num;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i>=0;i--) {
			System.out.printf("猜猜0~99的數字\n");
			num=sc.nextInt();
			if(num==pwd) {
				System.out.printf("恭喜猜對了\n");
				break;
			}
			System.out.printf("猜錯啦 還剩%d次\n",i);
		}
		System.out.printf("遊戲結束\n");
	}
}
