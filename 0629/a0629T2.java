import java.util.Scanner;
public class a0629T2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.next().charAt(0);
		int i = (int) ch ;
		
		System.out.printf("判斷輸入字元類別\n");
		System.out.printf("請輸入任意字元: %s\n",i);
		if(48<=i && i<=57)
		{
		System.out.printf("這是數字字元\n" );
		}
		else if(65<=i && i<=90)
		{
		System.out.printf("這是大寫字元\n" );
		}
		else if(97<=i && i<=122)
		{
		System.out.printf("這是小寫字元\n" );
		}
		else
		{
		System.out.printf("這是特殊字元\n" );
		}
	}

}
