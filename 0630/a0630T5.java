import java.util.Scanner;
public class a0630T5 {

	public static void hannoi(int discNum,char from,char buffer,char to) {
		if(discNum==1) {
			System.out.printf("將碟子從[%c]",from);
			System.out.printf("移動到[%c]\n",to);
		}
		else {
			hannoi(discNum-1,from,to,buffer);
			System.out.printf("將碟子從[%c]",from);
			System.out.printf("移動到[%c]\n",to);
			hannoi(discNum-1,buffer,from,to);
		}
	}
	
	
	public static void main(String[] args) {
		int discNum;
		Scanner sc=new Scanner(System.in);
		System.out.printf("輸入圓盤數量:\n");
		discNum=sc.nextInt();
		hannoi(discNum,'A','B','C');
	}
}
