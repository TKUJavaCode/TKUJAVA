
public class a0706T5 {

	public static void main(String[] args) {
		int[] dice=new int[5];
		for(int i=0;i<5;i++) {
			dice[i]=(int)(Math.random()*(49-1+1))+1;
			System.out.printf("[%d]",dice[i]);
		}

	}

}
