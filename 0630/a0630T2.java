import java.util.Scanner;

class Bank{
			int account;
			int balance;
			void printinfo(){
				System.out.printf("±b§·:%d,æl√B:%d\n",account,balance);
			}
}

public class a0630T2 {

	public static void main(String[] args) {
		Bank[] TaipeiBank=new Bank[5];
			
		for(int i=0;i<TaipeiBank.length;i++) {
			TaipeiBank[i]=new Bank();
			TaipeiBank[i].account=10000+i;
			TaipeiBank[i].balance=0;
		}
		
		for(Bank sh:TaipeiBank)
			sh.printinfo();
		}

	}


