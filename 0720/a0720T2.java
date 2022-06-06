

public class a0720T2 {
	public void catchThrows(int str)throws ArrayIndexOutOfBoundsException,
	ArithmeticException,NullPointerException{
		System.out.println(str);
		if(str==1) {
			int[] a=new int[3];
			a[5]=1;
		}else if(str==2) {
			int i=0;
			int j=5/i;
		}else if(str==3) {
			String[] s=new String[5];
			s[0].toLowerCase();
		}else {
			System.out.println("正常執行沒有發現例外");
		}
	}
	
	public static void main(String[] args) {
		a0720T2 yc=new a0720T2();//catchThrows寫在大class裡，初始化本身類別以啟用catchThrows()
		try {
			yc.catchThrows(0);
		}catch(Exception e){
			System.out.println("例外"+e);
		}
		try {
			yc.catchThrows(1);
		}catch(Exception e){
			System.out.println("例外"+e);
		}
		try {
			yc.catchThrows(2);
		}catch(Exception e){
			System.out.println("例外"+e);
		}
		try {
			yc.catchThrows(3);
		}catch(Exception e){
			System.out.println("例外"+e);
		}

	}

}
