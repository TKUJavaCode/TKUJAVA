

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
			System.out.println("���`����S���o�{�ҥ~");
		}
	}
	
	public static void main(String[] args) {
		a0720T2 yc=new a0720T2();//catchThrows�g�b�jclass�̡A��l�ƥ������O�H�ҥ�catchThrows()
		try {
			yc.catchThrows(0);
		}catch(Exception e){
			System.out.println("�ҥ~"+e);
		}
		try {
			yc.catchThrows(1);
		}catch(Exception e){
			System.out.println("�ҥ~"+e);
		}
		try {
			yc.catchThrows(2);
		}catch(Exception e){
			System.out.println("�ҥ~"+e);
		}
		try {
			yc.catchThrows(3);
		}catch(Exception e){
			System.out.println("�ҥ~"+e);
		}

	}

}
