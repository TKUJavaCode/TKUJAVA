import java.util.Scanner;
public class a0715T2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x = 7, i, ans = 0;//x��l�ȳ]��7,�q7���@���}�l��
		System.out.println("�R�]���Z������D");
		System.out.println("��J�̦h��X��");
		int h=sc.nextInt();//�}�C�j�p�A�̦h��X��
		String ele="";//�sfor each�n�L���r��
		int cx=0;//�ӥN��}�C���ĴX�� savearr[cx]
		int[] savearr=new int[h];
        boolean flag = false;//�p�G��쵪�� flag�|=true
        System.out.println("��J�Q��7���X���H���G");
        int n=sc.nextInt();//n�N��]��7���X��
        for (i = 1; i <= n; i++) {// �N�j�馸�Ʃw��150�A��ܴM��d�򬰡G7��1050����
            if ((x % 2 == 1) && (x % 3 == 2) && (x % 5 == 4) 
            		&& (x % 6 == 5) && (x % 7 == 0)) {
                ans = x;//ans�N��ŦX����
                flag = true;
                if(savearr.length>cx)//�Ycx�S�W�L�}�C�j�p�N�~���i�h
                savearr[cx]=ans;
                cx++;//[0]->[1]......
            }
            x = 7 * (i + 1);//�Ĥ@���B�槹�|����7*2,x=14
        }
        if (true == flag) {
        	System.out.println("����(0�N��S��)�G");
        	for(int p:savearr){//�L�X�}�C�̪���
    			ele+=p+"\t";
            }
    		System.out.println(ele);
        }
           
        else
            System.out.println("�b7��1��50���o�ӽd�򤺨S�����G");
	}
}
