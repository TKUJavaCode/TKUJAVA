
public class a0721T1 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("������");//set�ثe����Ǫ��W�r
		System.out.println(t.getName()+"is a running thread!");//����ثe����Ǫ��W�r
		try {
			for(int i=0;i<5;i++) {
				System.out.println("sleep time"+i);
				Thread.sleep(1000);//�ίv1000�@��
			}
		}catch(InterruptedException e) {
			System.out.println("Thread is error!");
		}

	}

}
