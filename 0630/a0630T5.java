import java.util.Scanner;
public class a0630T5 {

	public static void hannoi(int discNum,char from,char buffer,char to) {
		if(discNum==1) {
			System.out.printf("�N�Фl�q[%c]",from);
			System.out.printf("���ʨ�[%c]\n",to);
		}
		else {
			hannoi(discNum-1,from,to,buffer);
			System.out.printf("�N�Фl�q[%c]",from);
			System.out.printf("���ʨ�[%c]\n",to);
			hannoi(discNum-1,buffer,from,to);
		}
	}
	
	
	public static void main(String[] args) {
		int discNum;
		Scanner sc=new Scanner(System.in);
		System.out.printf("��J��L�ƶq:\n");
		discNum=sc.nextInt();
		hannoi(discNum,'A','B','C');
	}
}
