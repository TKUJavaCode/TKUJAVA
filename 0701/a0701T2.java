import java.util.Scanner;
class School{
	int studentID=0;
	String name=null;
	
	School(int a){
		studentID=a;
	}
	
	School(String str){
		name=str;
	}
	
	School(int a,String str){
		studentID=a;
		name=str;
	}
	
	void printINfo(){
		System.out.printf("¾Ç¸¹:%d",studentID);
		System.out.println(",©m¦W:"+name);
	}
	
	
}

public class a0701T2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String b=sc.next();
		School A =new School(a);
		A.printINfo();
		School B =new School(b);
		B.printINfo();
		School C =new School(a,b);
		C.printINfo();
		
	}

}
