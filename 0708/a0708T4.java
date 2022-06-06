interface school{
	void showschool();
}

interface subject{
	void showsubject();
}

class students implements school,subject{
	students(String name){
		System.out.println("Name:"+name);
	}
	public void showschool() {
		System.out.println("TKU");
	}
	
	public void showsubject() {
		System.out.println("Compiler");
	}
	
}

public class a0708T4 {

	public static void main(String[] args) {
		students sts=new students("XYZ");
		sts.showschool();
		sts.showsubject();
		
	}

}
