
public class a0720T1 {

	public static void main(String[] args) {
		int[] array= {0,1,2,3,4};
		int a=0;
		try {
			for(int i=0;i<=10;i++) {
				System.out.println(array[i]);
			}
			int z=5/a;
		}catch(ArithmeticException e) {
			System.out.println("0不能被當作被除數");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array[]的長度為5，陣列下標越界");
		}
		System.out.println("無例外執行成功");
		
		System.out.println("--------------------分隔線---------------------");
		
		try {
			int z=5/a;
			for(int i=0;i<=10;i++) {
				System.out.println(array[i]);
			}
		}catch(ArithmeticException e) {
			System.out.println("0不能被當作被除數");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array[]的長度為5，陣列下標越界");
		}
		System.out.println("無例外執行成功");
		System.out.println("--------------------技術總結---------------------");
		System.out.println("當try中的某條語句引發了例外後，程式立即跳轉到catch部分，尋找和該例外類型\r\n" + 
				"相對應的catch語句並執行catch{}中的所有語句。");
		System.out.println("而位於try中的發生例外語句後面的所有語句都不會執行。");

	}

}
