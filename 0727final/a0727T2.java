class demooverload{
	void show(char ch) {
		System.out.printf("%s\n",ch);
	}
	
	void show(char ch,int n) {
		System.out.printf("%s ",ch);
		System.out.printf("%d",n);
	}
}

public class a0727T2 {

	public static void main(String[] args) {
		demooverload obj=new demooverload();
		obj.show('A');
		obj.show('B',90);
		
	}

}