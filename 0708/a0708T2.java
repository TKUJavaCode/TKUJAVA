//�d�� https://pydoing.blogspot.com/2010/11/java-inherit.html
abstract class sys{
	private String name;
	private int sID;
	private String subject;
	private int score;
	abstract void showscore();
	public void showinfo() {
		System.out.println("�ǥͩm�W:"+name+"\t"+"�Ǹ�:"+sID);
	}
	sys(String name,int sID,String subject,int score){
		this.name=name;
		this.sID=sID;
		this.subject=subject;
		this.score=score;
	}
	public int getscore(){//����L���O��ϥΨ�private���ݩ�
		return score;
	}
	
	public void setscore(int score) {
        this.score=score;
    }
	
	public String getsubject(){//����L���O��ϥΨ�private���ݩ�
		return subject;
	}
	
	public void setsubject(String subject) {
        this.subject=subject;
    }
}

class student extends sys{
	student(String name, int sID, String subject, int score) {
		super(name, sID, subject, score);
	}
	
	public void showscore() {
		System.out.println("���:"+getsubject()+"\t"+"���Z"+getscore());
		//�]subject��score�ݩʳ���private�ҥH�u��Τ����O���� public��k �h�I�s
	}
}


public class a0708T2 {

	public static void main(String[] args) {
		student st=new student("Allen",410222587,"Math",100);
		st.showinfo();
		st.showscore();
	}

}
