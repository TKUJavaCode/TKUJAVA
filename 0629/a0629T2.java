import java.util.Scanner;
public class a0629T2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.next().charAt(0);
		int i = (int) ch ;
		
		System.out.printf("�P�_��J�r�����O\n");
		System.out.printf("�п�J���N�r��: %s\n",i);
		if(48<=i && i<=57)
		{
		System.out.printf("�o�O�Ʀr�r��\n" );
		}
		else if(65<=i && i<=90)
		{
		System.out.printf("�o�O�j�g�r��\n" );
		}
		else if(97<=i && i<=122)
		{
		System.out.printf("�o�O�p�g�r��\n" );
		}
		else
		{
		System.out.printf("�o�O�S��r��\n" );
		}
	}

}
