public class a0714midr3 {

	public static void main(String[] args) {
		String result="";//�L����
        String result2="";//�L�Ƨǫᵪ��
        int lottery[]=new int [5];//5�Ӹ��X
        int special;//�S�O��
        boolean flagRepeat=false;//���ҬO�_���ƪ��X��
        int x=0;//�ǳƱ��H����
        
        java.util.Random randomInt =new java.util.Random();//�ŧi�ü�
		
		for(int i=0;i<lottery.length;i++){
            do{
                flagRepeat=false;
                x=randomInt.nextInt(100-50+1)+50;//���X50~100  +1�����X50~100
                for(int j=0;j<=i;j++){
                    if(x==lottery[j]){
                        flagRepeat=true;
                        break;
                    }
                }                       
            }while(flagRepeat);//�����~��
            lottery[i]=x;//x�S���� ��i�h�}�C
        }
		
		result2+="�}��5�Ӹ��X(50~100�Ѥp��j �w�Ƨ�):\t";
        for(int i=0;i<lottery.length-1;i++){
            for(int j=i+1;j<lottery.length;j++){
                if(lottery[i]>lottery[j]){//lottery[i]<lottery[j]�j�ƨ�p lottery[i]>lottery[j]�p�ƨ�j
                    int temp=0;
                    temp=lottery[i];
                    lottery[i]=lottery[j];
                    lottery[j]=temp;
                }
            }
        }
        
		 for(int i:lottery){//�L�X�}�C�̪���
	            result2+=i+"\t";
	        }
		 System.out.println(result2);
	}

}