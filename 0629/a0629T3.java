import java.util.Scanner;
public class a0629T3 {

	public static void main(String[] args) {
		String choice;
		int height;
		int price;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.printf("選擇水果(輸入名稱)\napple(20元/斤)  banana(18元/斤)  bananawatermelon(10元/斤)\n");
			choice=sc.next();
			switch(choice) {
				case "apple":
					System.out.printf("請輸入購買幾斤:\n");
					height=sc.nextInt();
					price=20*height;
					System.out.printf("蘋果總金額:%d\n\n",price);
					break;
				case "banana":
					System.out.printf("請輸入購買幾斤:\n");
					height=sc.nextInt();
					price=18*height;
					System.out.printf("香蕉總金額:%d\n\n",price);
					break;
				case "watermelon":	
					System.out.printf("請輸入購買幾斤:\n");
					height=sc.nextInt();
					price=10*height;
					System.out.printf("西瓜總金額:%d\n\n",price);
					break;
				default :
					System.out.printf("請輸入正確種類!\n\n");
			}
		}
	}

}
