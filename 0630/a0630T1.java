import java.util.Scanner;

public class a0630T1 {

	public static void main(String[] args) {
		final int pwd=70;
		int num;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i>=0;i--) {
			System.out.printf("�q�q0~99���Ʀr\n");
			num=sc.nextInt();
			if(num==pwd) {
				System.out.printf("���߲q��F\n");
				break;
			}
			System.out.printf("�q���� �ٳ�%d��\n",i);
		}
		System.out.printf("�C������\n");
	}
}
