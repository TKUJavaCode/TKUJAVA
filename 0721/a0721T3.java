
public class a0721T3 {

	public static void main(String[] args) {
		RunabbleDemo rd=new RunabbleDemo();
		rd.RDemo(rd);
		System.out.println(rd.print());

	}

}
class RunabbleDemo extends ThreadRun implements Runnable{
	Thread t2=null;
	public void RDemo(RunabbleDemo r1) {
		Thread t1=new Thread(r1,"第一執行緒");
		System.out.println("正在執行的是"+t1);
		
		t2=new Thread(r1,"第二執行緒");
		System.out.println("產生第二執行緒");
		System.out.println("第一執行緒開始休眠");
		t2.start();
		
		try {
			t1.sleep(100);
		}catch(InterruptedException e) {
			System.out.println("第一執行緒錯誤");
		}
		System.out.println("第一執行緒恢復執行");
		
	}
	public void run() {
		try {
			for(int i=0;i<800;i+=100) {
				System.out.println("第二執行緒的休眠時間"+i);
				t2.sleep(i);
			}
		}catch(InterruptedException e) {
			System.out.println("第二執行緒錯誤");
		}
		System.out.println("第二執行緒結束");
	}
}
class ThreadRun{
	public String print() {
		return "我是RunabbleDemo的父類別";
	}
}