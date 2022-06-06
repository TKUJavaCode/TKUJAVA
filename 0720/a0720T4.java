
public class a0720T4 {
		static int x;
	public static void main(String[] args) {
		new a0720T4().setX(0);
		double a=Math.random()*10;
		
		if(x>0)
			System.out.println("a/x="+(a/x));
		else
			try {
				throw new Exception();
			}catch(Exception e) {
				System.out.println("出現例外的原因  "+e.getMessage());
			}
		
	}
	public void setX(int x) {
		this.x=x;
	}
}
