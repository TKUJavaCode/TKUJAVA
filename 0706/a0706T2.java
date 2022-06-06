class Person{
	public static int age;//全局的age都是同一值
	public String name;
	public void output() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}


public class a0706T2 {

	public static void main(String[] args) {
		Person P1=new Person();
		P1.name="Peter";
		P1.age=20;
		Person P2=new Person();
		P2.name="John";
		P2.age=25;
		P1.output();
		P2.output();
		Person.age=30;
		P1.output();
		P2.output();
	}

}
