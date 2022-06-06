//範例 https://pydoing.blogspot.com/2010/11/java-inherit.html
abstract class sys{
	private String name;
	private int sID;
	private String subject;
	private int score;
	abstract void showscore();
	public void showinfo() {
		System.out.println("學生姓名:"+name+"\t"+"學號:"+sID);
	}
	sys(String name,int sID,String subject,int score){
		this.name=name;
		this.sID=sID;
		this.subject=subject;
		this.score=score;
	}
	public int getscore(){//讓其他類別能使用到private的屬性
		return score;
	}
	
	public void setscore(int score) {
        this.score=score;
    }
	
	public String getsubject(){//讓其他類別能使用到private的屬性
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
		System.out.println("科目:"+getsubject()+"\t"+"成績"+getscore());
		//因subject跟score屬性都為private所以只能用父類別中的 public方法 去呼叫
	}
}


public class a0708T2 {

	public static void main(String[] args) {
		student st=new student("Allen",410222587,"Math",100);
		st.showinfo();
		st.showscore();
	}

}
