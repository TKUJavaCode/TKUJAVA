
public class a0720T1 {

	public static void main(String[] args) {
		int[] array= {0,1,2,3,4};
		int a=0;
		try {
			for(int i=0;i<=10;i++) {
				System.out.println(array[i]);
			}
			int z=5/a;
		}catch(ArithmeticException e) {
			System.out.println("0����Q��@�Q����");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array[]�����׬�5�A�}�C�U�жV��");
		}
		System.out.println("�L�ҥ~���榨�\");
		
		System.out.println("--------------------���j�u---------------------");
		
		try {
			int z=5/a;
			for(int i=0;i<=10;i++) {
				System.out.println(array[i]);
			}
		}catch(ArithmeticException e) {
			System.out.println("0����Q��@�Q����");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array[]�����׬�5�A�}�C�U�жV��");
		}
		System.out.println("�L�ҥ~���榨�\");
		System.out.println("--------------------�޳N�`��---------------------");
		System.out.println("��try�����Y���y�y�޵o�F�ҥ~��A�{���ߧY�����catch�����A�M��M�Өҥ~����\r\n" + 
				"�۹�����catch�y�y�ð���catch{}�����Ҧ��y�y�C");
		System.out.println("�Ӧ��try�����o�ͨҥ~�y�y�᭱���Ҧ��y�y�����|����C");

	}

}
