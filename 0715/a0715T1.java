import java.util.Scanner;
import java.io.IOException;

public class a0715T1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		int n;
		String elements1="";
		String elements2="";
		int i;
		int swap;
		System.out.println("��J10�Ӿ��");
		System.out.println("��e5�Ӥ����|�P��5�Ӥ����ﴫ");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			do {  //�P�_�O�_���Ŧ�A�p�G�O�h���s��J
				n=1;
				try{	 //�إߤ@�Өҥ~����
					arr[i] = (int)arr[i];  //����r������
					//�쥻�OInteger.parseInt(buf[i].readLine());
				}catch (NumberFormatException e) {
					System.out.println("��ƿ�J���~�A�Э��s��J");  //�B�z�ҥ~
					n=0;
				}/*catch (IOException e) {
					e.printStackTrace();
				}*/
			}while(n==0);
		}
		
		System.out.println("�洫�e�}�C:");
		for(int j:arr){//�L�X�}�C�̪���
			elements1+=j+"\t";
        }
		System.out.println(elements1);
		
		for(int z=0;z<5;z++) {//�ΨӶi��洫
			swap = arr[z];
			arr[z] = arr[9-z];
			arr[9-z]=swap;
		}
		
		System.out.println("�洫��}�C:");
		for(int j:arr){//�L�X�}�C�̪���
			elements2+=j+"\t";
        }
		System.out.println(elements2);
	}

}
