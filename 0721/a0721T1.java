
public class a0721T1 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("單執行序");//set目前執行序的名字
		System.out.println(t.getName()+"is a running thread!");//獲取目前執行序的名字
		try {
			for(int i=0;i<5;i++) {
				System.out.println("sleep time"+i);
				Thread.sleep(1000);//睡眠1000毫秒
			}
		}catch(InterruptedException e) {
			System.out.println("Thread is error!");
		}

	}

}
