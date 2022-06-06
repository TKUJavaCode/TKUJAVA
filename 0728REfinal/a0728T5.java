
public class a0728T5 {

	public static void main(String[] args) {
		for(int a=1;a<=6;a++) {//層數
			for(int b=5-a;b>=0;b--){//印空格
				System.out.printf(" ");
			}
			for(int c=7-a;c<=6;c++) {//印星星
				System.out.printf(" *");
			}
			System.out.println();//換行
		}
	}
}
 