
public class a0720T5 {
	void findThrows() {
		try {
			throw new ArithmeticException();
		}catch(ArithmeticException ae) {
			throw ae;
		}
	}
	public static void main(String[] args) {
		a0720T5 ct=new a0720T5();
		try {
			ct.findThrows();
		}catch(ArithmeticException e) {
			System.out.println("�X�{�ҥ~����]�O:"+e);
		}

	}

}
