class numcal2{
	int temp=0;
	public int cal2(int n){
		if(n%3==0&&n%5==0&&n%7==0) {
			return n;
		}else {
			return cal2(n+1);
		}
	}
	
}

public class a0727T6 {

	public static void main(String[] args) {
		numcal2 nc2=new numcal2();
		System.out.println(nc2.cal2(1));
		
	}

}
