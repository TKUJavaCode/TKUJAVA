class Throw{
	void myThrow() throws ArithmeticException,InterruptedException
	{
		myThrow_1(3,6);
	}
	int myThrow_1(int x,int y) throws ArithmeticException
	{
		return x/y;
	}
	
	
}
public class a0720T3 extends Throw{
	void myThrow() {
		try {
			myThrow_1(7,0);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		//throw new RuntimeException("°õ¦æ®É¨Ò¥~");
	}
	public static void main(String[] args) {
		new a0720T3().myThrow();
		
		
		
		
		
		
		
		
		
		
	}

}
