import java.util.Scanner;
class school{
	String name;
	int age;
	school(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	String getname(){
		return name;
	}
	int getage(){
		return age;
	}
	/*
	public void setname(){
		name="���p��";
	}
	
	public void setage(){
		age=40;
	}*/
	
}

class teacher extends school{
	String subject;
	teacher(String name,int age,String subject){
		super(name,age);
		this.subject=subject;
		teaches();
	}
	String getsubject(){
		return subject;
	}
	
	/*
	public void setsubject(){
		subject="����";
	}*/
	
	public void teaches(){
		System.out.println(getname()+"�Ѯv,"+"�½�"+getsubject());
	}
	
}

class student extends school{
	int grade;
	student(String name,int age,int grade){
		super(name,age);
		this.grade=grade;
		test();
	}
	/*public void setgrade(){
		grade=90;
	}
	*/
	int getgrade(){
		return grade;
	}
	public void test(){
		System.out.println(getname()+"�ǥ�,"+"�Ҹձo"+getgrade()+"��");
	}
}

public class a0707T2 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		System.out.println("[���G]");
		teacher te=new teacher("���p��",40,"����");
		student st=new student("�i�p��",15,90);
		

	}

}
