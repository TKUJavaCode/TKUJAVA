//�j�ֳz http://gintama0112.blogspot.com/2016/01/java-1.html

public class a0706T4 {

	public static void main(String[] args) {
		String result="";//�L����
        String result2="";//�L�Ƨǫᵪ��
        int lottery[]=new int [6];//�ֳz���Ӹ��X
        int special;//�S�O��
        boolean flagRepeat=false;//���ҬO�_���ƪ��X��
        int x=0;//�ǳƱ��H����
        
        java.util.Random randomInt =new java.util.Random();//�ŧi�ü�
        
		/*int[] dice=new int[5];
		for(int i=0;i<5;i++) {
			dice[i]=(int)(Math.random()*(49-1+1))+1;
			System.out.printf("[%d]",dice[i]);
		}*/
		
		for(int i=0;i<lottery.length;i++){
            do{
                flagRepeat=false;
                x=randomInt.nextInt(49)+1;//���X0~48  +1�����X1~49
                for(int j=0;j<=i;j++){
                    if(x==lottery[j]){
                        flagRepeat=true;
                        break;
                    }
                }                       
            }while(flagRepeat);//�����~��
            lottery[i]=x;//x�S���� ��i�h�}�C
        }
		
		 for(int i:lottery){
	            result2+=i+"\t";
	            
	        }
		 System.out.println(result2);
		  
		

	}

}