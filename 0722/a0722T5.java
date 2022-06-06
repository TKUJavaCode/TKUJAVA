
class ThreadT52 extends Thread{
	public ThreadT52() {
		
	}
	//private int x;
		//private int y;
		
		public synchronized void run() {
			for(int i=0;i<5;i++) {
				//x++;
				//y++;
				System.out.println(Thread.currentThread().getName()+" 第"+(i+1)+"次");
				try {
					Thread.sleep(100);//睡眠100毫秒
				}catch(InterruptedException e) {
					System.out.println("執行緒出錯了");
				}
				
			}
			System.out.println("");
		}
}

public class a0722T5 {

	public static void main(String[] args) {
		/*System.out.println("1.用實作的");
		ThreadT5 t5=new ThreadT5();
		new Thread(t5).start();
		new Thread(t5).start();*/
		System.out.println("2.用繼承的");
		ThreadT52 t521=new ThreadT52();
		//synchronized(t521) {}
		t521.start();
		
		ThreadT52 t522=new ThreadT52();
		//synchronized(t522) {}
		t522.start();
		
	}

}
class ThreadT5 implements Runnable{
	//private int x;
	//private int y;
	
	public synchronized void run() {
		for(int i=0;i<5;i++) {
			//x++;
			//y++;
			System.out.println(Thread.currentThread().getName()+" 第"+(i+1)+"次");
			try {
				Thread.sleep(100);//睡眠100毫秒
			}catch(InterruptedException e) {
				System.out.println("執行緒出錯了");
			}
			
		}
		System.out.println("");
	}
	
	/*public synchronized String call() {
		String name=Thread.currentThread().getName();
		return "";
	}*/
}