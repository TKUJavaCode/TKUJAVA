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
		System.out.printf("輸入經過幾個月了:");
		month=sc.nextInt();
		rabbit ra=new rabbit();
		System.out.printf("第%d個月,有%d對兔子",month,ra.rabbit2(month));
	}

}
