
public class a0720T6 {

	public static void main(String[] args) {
		try {
			System.out.println("only try,not have catch");
			try {
			throw_do();}
			catch(ArithmeticException e) {
				System.out.println("this is catch model :"+e);
			}
			System.out.println("after throw_do then print");//��2�h��try catch�A���o�����ܥX�ӡA�]�������N�|����
		}
		finally {
			System.out.println("finally executing");
		}

	}
	public static void throw_do() {
		throw new ArithmeticException();
	}
}
