
public class a0721T2 {

	public static void main(String[] args) {
		ThreadSubName t1=new ThreadSubName("Thread 1",200);
		ThreadSubName t2=new ThreadSubName("Thread 2",100);
		ThreadSubName t3=new ThreadSubName("Thread 3",300);
		t1.start();
		t2.start();
		t3.start();

	}

}
class ThreadSubName extends Thread{
	private String threadName;
	private int Ms;
	public ThreadSubName(String threadName,int Ms) {
		this.threadName=threadName;
		this.Ms=Ms;
	}
	public void run() {
		try {
			sleep(Ms);
		}catch(InterruptedException e) {
			System.out.println("the thread is wrong!");
		}
		System.out.println("¦W¦r¥s"+threadName+",¶}©l¥ð¯v"+Ms+"²@¬í");
	}
	
	
	
}
