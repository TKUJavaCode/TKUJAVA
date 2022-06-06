
public class a0722T4 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		new Thread(t1).start();
		new Thread(t1).start();
		new Thread(t1).start();
	}

}

class Thread1 implements Runnable{
	private int i=5;
	public void run() {
		while(true) {
			try {
				Thread.sleep(50);
			}catch(Exception e) {
				
			}
			synchronized(this) {
				if(i>0&&i!=0) {
					try {
						Thread.sleep(5);
					}catch(Exception e) {
						
					}
					System.out.println(Thread.currentThread().getName()+"°õ¦æ"+i--+"¦¸");
				}
			}
			
		}
	}
}