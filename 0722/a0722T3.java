//執行出來會空白 因為14行的wait
public class a0722T3 {

	public static void main(String[] args) {
		new a0722T3();

	}
	
	a0722T3(){
		a0722T3 a1=this;
		a0722T3 a2=this;
		synchronized(a1) {
			try {
				a2.wait();
				System.out.println("Hello");
			}catch(InterruptedException e) {
				System.out.println("Good bye");
			}catch(Exception e) {
				System.out.println("The method is wrong");
			}finally {
				System.out.println("Finally");
			}
		}
		System.out.println("Together");
	}

}
