import java.util.Scanner;
public class a0715T3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("��J�@��Ʀr�A�P�_�O�_�O�j��Ʀr(�˹L�Ӭݷ|�@��)");
        String num = sc.next();
        StringBuffer ss = new StringBuffer(num);
        ss.reverse();
        int flag = 0;
        for(int i = 0;i < num.length();i++) {
            if(num.charAt(i) != ss.charAt(i)) {
            	//��l�Ʀr�����᪺�Ʀr��� ���@�ˮ�flag=0
                flag = 1;
                break;
            }
        }
        System.out.println("�Ʀr���X��:"+num.length()+"��");
        if(flag == 1) {
        	System.out.printf("�O���O�j��Ʀr:");
            System.out.println("���O");
        }
        else {
        	System.out.printf("�O���O�j��Ʀr:");
            System.out.println("�O");
        }
    }
}