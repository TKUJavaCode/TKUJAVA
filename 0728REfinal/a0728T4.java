import java.util.*;
public class a0728T4 {
	static long test2(int i) {
		if(i==1) {
			return 1;
		}else {
			return (i*test2(i-1));
		}
		
	}
	public static void main(String[] args) {
		long sum=0;
		for(int h=1;h<=20;h++) {
			sum+=test2(h);
			System.out.printf("%d != %d \n",h,test2(h));
		}
		System.out.printf("�[�_�Ӫ��X:%d",sum);
		
	}

}
/*Scanner sc=new Scanner(System.in);
//�H�U��for��k
int i;
int fact, sum;
System.out.println("�D1! + 2! + �K�Kn!");
System.out.println("��J����:");
int n=sc.nextInt();
sum = 0;
fact = 1;
for(i = 1; i <= n; i++){
	fact *= i; //�����p��i�I, �R���Q�Τ������G
	sum += fact;
}
System.out.printf("���G");
System.out.println(sum);*/