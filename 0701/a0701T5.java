import java.util.Scanner;

class rabbit{
	int rabbit2(int a) {
		int month=a;
		if(month==1||month==2)
			return 1;
		else
			return rabbit2(month-1)+rabbit2(month-2);
	}
	
}

public class a0701T5 {

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month;
		System.out.printf("��J�g�L�X�Ӥ�F:");
		month=sc.nextInt();
		rabbit ra=new rabbit();
		System.out.printf("��%d�Ӥ�,��%d��ߤl",month,ra.rabbit2(month));
	}

}
