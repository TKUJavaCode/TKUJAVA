class numcal{
	int temp=0;
	
	public int cal(int n){
		if(n==1) {
			return 1;
		}else {
			return n*(n-1);
		}
	}
	
}
public class a0727T4 {

	public static void main(String[] args) {
		numcal nc=new numcal();
		System.out.println(nc.cal(30));
	}

}
