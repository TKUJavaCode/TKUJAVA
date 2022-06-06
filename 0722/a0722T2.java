
public class a0722T2 {

	public static void main(String[] args) {
		ThreadTest tt=new ThreadTest();
		new Thread(tt).start();
		new Thread(tt).start();
		System.out.println(tt.call());
	}
}
class ThreadTest implements Runnable{
	private int x;
	private int y;
	public synchronized void run() {
		for(int i=0;i<4;i++) {
			x++;
			y++;
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				System.out.println("°õ¦æºü¥X¿ù¤F");
			}
			System.out.println(Thread.currentThread().getName()+"x="+x+",y="+y+" "+i);
		}
	}
	
	public synchronized String call() {
		String name=Thread.currentThread().getName();
		return "Hello  "+name;
	}
}