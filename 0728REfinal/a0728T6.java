public class a0728T6 {

	public static void main(String[] args) {
		System.out.println("1~10000可整除3跟5跟7的數:");
		for(int i=1;i<=10000;i++) {
			if(i%3==0&&i%5==0&&i%7==0)
				System.out.println(i);
		}
	}
}