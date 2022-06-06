
class s_data{
	int x,y;
}



public class a0630T3 {
	
	public static void swap(s_data A) {
		int tmp=A.x;
		A.x=A.y;
		A.y=tmp;
		System.out.printf("swap method,x=%d,y=%d\n",A.x,A.y);
	}
	
	
	public static void main(String[] args) {
		s_data B=new s_data();
		B.x=10;
		B.y=2;
		System.out.printf("before calling swap method:x=%d,y=%d\n",B.x,B.y);
		swap(B);
		System.out.printf("After calling swap method:x=%d,y=%d\n",B.x,B.y);
	}

}
