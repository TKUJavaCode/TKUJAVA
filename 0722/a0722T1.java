
public class a0722T1 {

	public static void main(String[] args) {
		TextThread t=new TextThread();
		new Thread(t).start();
		new Thread(t).start();
	}

}

class TextThread implements Runnable{
	private int num=5;
	public void run() {
		while(true) {
			synchronized(this) {//�P�B�{���X�϶�
				if(num>0) {
					try {
						Thread.sleep(100);
					}catch(Exception e) {
						System.out.println(Thread.currentThread().getName()+"�X���F");
					}
					System.out.println(Thread.currentThread().getName()+"�Ʀr��"+num--);
				}
				else {
					System.out.println(Thread.currentThread().getName()+" �h�X�F");
					break;
				}
			}
		}
	}
	
}