import java.util.Scanner;
public class a0629T3 {

	public static void main(String[] args) {
		String choice;
		int height;
		int price;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.printf("��ܤ��G(��J�W��)\napple(20��/��)  banana(18��/��)  bananawatermelon(10��/��)\n");
			choice=sc.next();
			switch(choice) {
				case "apple":
					System.out.printf("�п�J�ʶR�X��:\n");
					height=sc.nextInt();
					price=20*height;
					System.out.printf("ī�G�`���B:%d\n\n",price);
					break;
				case "banana":
					System.out.printf("�п�J�ʶR�X��:\n");
					height=sc.nextInt();
					price=18*height;
					System.out.printf("�����`���B:%d\n\n",price);
					break;
				case "watermelon":	
					System.out.printf("�п�J�ʶR�X��:\n");
					height=sc.nextInt();
					price=10*height;
					System.out.printf("����`���B:%d\n\n",price);
					break;
				default :
					System.out.printf("�п�J���T����!\n\n");
			}
		}
	}

}
