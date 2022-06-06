
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
			synchronized(this) {//同步程式碼區塊
				if(num>0) {
					try {
						Thread.sleep(100);
					}catch(Exception e) {
						System.out.println(Thread.currentThread().getName()+"出錯了");
					}
					System.out.println(Thread.currentThread().getName()+"數字為"+num--);
				}
				else {
					System.out.println(Thread.currentThread().getName()+" 退出了");
					break;
				}
			}
		}
	}
	
}