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
		System.out.printf("加起來的合:%d",sum);
		
	}

}
/*Scanner sc=new Scanner(System.in);
//以下用for算法
int i;
int fact, sum;
System.out.println("求1! + 2! + ……n!");
System.out.println("輸入階乘:");
int n=sc.nextInt();
sum = 0;
fact = 1;
for(i = 1; i <= n; i++){
	fact *= i; //遞推計算i！, 充分利用中間結果
	sum += fact;
}
System.out.printf("結果");
System.out.println(sum);*/