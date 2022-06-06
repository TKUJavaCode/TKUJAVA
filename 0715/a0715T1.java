import java.util.Scanner;
import java.io.IOException;

public class a0715T1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		int n;
		String elements1="";
		String elements2="";
		int i;
		int swap;
		System.out.println("輸入10個整數");
		System.out.println("其前5個元素會與後5個元素對換");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			do {  //判斷是否為空串，如果是則重新輸入
				n=1;
				try{	 //建立一個例外捕獲
					arr[i] = (int)arr[i];  //執行字串轉整數
					//原本是Integer.parseInt(buf[i].readLine());
				}catch (NumberFormatException e) {
					System.out.println("資料輸入錯誤，請重新輸入");  //處理例外
					n=0;
				}/*catch (IOException e) {
					e.printStackTrace();
				}*/
			}while(n==0);
		}
		
		System.out.println("交換前陣列:");
		for(int j:arr){//印出陣列裡的值
			elements1+=j+"\t";
        }
		System.out.println(elements1);
		
		for(int z=0;z<5;z++) {//用來進行交換
			swap = arr[z];
			arr[z] = arr[9-z];
			arr[9-z]=swap;
		}
		
		System.out.println("交換後陣列:");
		for(int j:arr){//印出陣列裡的值
			elements2+=j+"\t";
        }
		System.out.println(elements2);
	}

}
