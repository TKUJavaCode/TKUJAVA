
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
		Thread t1=new Thread(r1,"�Ĥ@�����");
		System.out.println("���b���檺�O"+t1);
		
		t2=new Thread(r1,"�ĤG�����");
		System.out.println("���ͲĤG�����");
		System.out.println("�Ĥ@������}�l��v");
		t2.start();
		
		try {
			t1.sleep(100);
		}catch(InterruptedException e) {
			System.out.println("�Ĥ@��������~");
		}
		System.out.println("�Ĥ@�������_����");
		
	}
	public void run() {
		try {
			for(int i=0;i<800;i+=100) {
				System.out.println("�ĤG���������v�ɶ�"+i);
				t2.sleep(i);
			}
		}catch(InterruptedException e) {
			System.out.println("�ĤG��������~");
		}
		System.out.println("�ĤG���������");
	}
}
class ThreadRun{
	public String print() {
		return "�ڬORunabbleDemo�������O";
	}
}